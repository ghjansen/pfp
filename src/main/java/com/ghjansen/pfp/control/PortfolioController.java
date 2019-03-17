package com.ghjansen.pfp.control;

import com.ghjansen.pfp.core.SketchDraw;
import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.*;
import com.ghjansen.pfp.classic.ClassicBehaviourCatalog;
import com.ghjansen.pfp.classic.ClassicColourCatalog;
import com.ghjansen.pfp.classic.ClassicComponentCatalog;
import com.ghjansen.pfp.classic.ClassicStyleCatalog;
import com.ghjansen.pfp.exception.UnsupportedCatalogException;

public final class PortfolioController extends Controller implements SketchSettings, SketchSetup, SketchDraw {

    private Portfolio portfolio;
    private ComponentController componentController;

    public PortfolioController(){
        this.portfolio = new Portfolio() {};
    }

    public void settings() {
        validatePortfolio();
        assemblePortfolio();
        createComponentController();
    }

    public void setup() {
        componentController.setup();
    }

    public void draw(){
        componentController.draw();
    }

    public void addCatalog(Catalog catalog){
        Class c = catalog.getClass().getSuperclass();
        if(ColourCatalog.class.equals(c)){
            portfolio.setColourCatalog((ColourCatalog) catalog);
        } else if(StyleCatalog.class.getSuperclass().equals(c)){
            portfolio.setStyleCatalog((StyleCatalog) catalog);
        } else if(BehaviorCatalog.class.equals(c)){
            portfolio.setBehaviorCatalog((BehaviorCatalog) catalog);
        } else if(ComponentCatalog.class.equals(c)){
            portfolio.setComponentCatalog((ComponentCatalog) catalog);
        } else {
            ExceptionController.getInstance().reportAndExit(new UnsupportedCatalogException("The catalog \'"+c.getName()+"\' is not supported"));
        }
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
    }

    private void validatePortfolio(){
        if(portfolio.getColourCatalog() == null){
            portfolio.setColourCatalog(new ClassicColourCatalog());
        }
        if(portfolio.getStyleCatalog() == null){
            portfolio.setStyleCatalog(new ClassicStyleCatalog());
        }
        if(portfolio.getBehaviorCatalog() == null){
            portfolio.setBehaviorCatalog(new ClassicBehaviourCatalog());
        }
        if(portfolio.getComponentCatalog() == null){
            portfolio.setComponentCatalog(new ClassicComponentCatalog());
        }
    }

    private void assemblePortfolio(){
        portfolio.getColourCatalog().assemble();
        portfolio.getStyleCatalog().assemble(portfolio.getColourCatalog());
        portfolio.getBehaviorCatalog().assemble(portfolio.getColourCatalog(), portfolio.getStyleCatalog());
        portfolio.getComponentCatalog().assemble(portfolio.getColourCatalog(), portfolio.getStyleCatalog(), portfolio.getBehaviorCatalog());
    }

    private void createComponentController(){
        componentController = new ComponentController(portfolio.getComponentCatalog());
        componentController.settings();
    }

}
