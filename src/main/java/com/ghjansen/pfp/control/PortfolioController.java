package com.ghjansen.pfp.control;

import com.ghjansen.pfp.catalog.*;

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
            throw new UnsupportedOperationException("The catalog \'"+c.getName()+"\' is not supported");
        }
    }


}
