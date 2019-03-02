package com.ghjansen.pfp.control;

import com.ghjansen.pfp.catalog.*;
import com.ghjansen.pfp.classic.ClassicBehaviourCatalog;
import com.ghjansen.pfp.classic.ClassicColourCatalog;
import com.ghjansen.pfp.classic.ClassicComponentCatalog;
import com.ghjansen.pfp.classic.ClassicStyleCatalog;
import com.ghjansen.pfp.exception.UnsupportedCatalogException;

public class PortfolioController {

    private Portfolio portfolio;

    public PortfolioController(){
        this.portfolio = new Portfolio() {};
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
            ExceptionController.getInstance().reportAndExit(new UnsupportedCatalogException("The catalog \'"+c.getName()+"\' is not supported"));
        }
        assemblyPortfolio();
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
        assemblyPortfolio();
    }

    public void assemblyPortfolio(){
        validatePortfolio();
        portfolio.getStyleCatalog().resolveDependencies(portfolio.getColourCatalog());
        portfolio.getBehaviorCatalog().resolveDependencies(portfolio.getColourCatalog(), portfolio.getStyleCatalog());
        portfolio.getComponentCatalog().resolveDependencies(portfolio.getColourCatalog(), portfolio.getStyleCatalog(), portfolio.getBehaviorCatalog());

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
