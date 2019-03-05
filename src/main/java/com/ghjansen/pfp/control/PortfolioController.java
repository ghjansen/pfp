package com.ghjansen.pfp.control;

import com.ghjansen.pfp.portfolio.*;
import com.ghjansen.pfp.classic.ClassicBehaviourCatalog;
import com.ghjansen.pfp.classic.ClassicColourCatalog;
import com.ghjansen.pfp.classic.ClassicComponentCatalog;
import com.ghjansen.pfp.classic.ClassicStyleCatalog;
import com.ghjansen.pfp.exception.UnsupportedCatalogException;

public final class PortfolioController extends Controller {

    private Portfolio portfolio;
    private ComponentController componentController;

    public PortfolioController(){
        this.portfolio = new Portfolio() {};
    }

    public void settings() {
        validatePortfolio();
        portfolio.getStyleCatalog().resolveDependencies(portfolio.getColourCatalog());
        portfolio.getBehaviorCatalog().resolveDependencies(portfolio.getColourCatalog(), portfolio.getStyleCatalog());
        portfolio.getComponentCatalog().resolveDependencies(portfolio.getColourCatalog(), portfolio.getStyleCatalog(), portfolio.getBehaviorCatalog());
        componentController = new ComponentController(portfolio);
        componentController.settings();
    }

    public void setup() {
        componentController.setup();
    }

    public void draw(){

    }

    public void addCatalog(Catalog catalog){
        Class c = catalog.getClass();
        if(ColourCatalog.class.equals(c)){
            portfolio.setColourCatalog((ColourCatalog) catalog);
        } else if(StyleCatalog.class.equals(c)){
            portfolio.setStyleCatalog((StyleCatalog) catalog);
        } else if(BehaviorCatalog.class.equals(c)){
            portfolio.setBehaviorCatalog((BehaviorCatalog) catalog);
        } else if(ComponentCatalog.class.equals(c)){
            portfolio.setComponentCatalog((ComponentCatalog) catalog);
        } else {
            ExceptionController.getInstance().reportAndExit(new UnsupportedCatalogException("The portfolio \'"+c.getName()+"\' is not supported"));
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

}
