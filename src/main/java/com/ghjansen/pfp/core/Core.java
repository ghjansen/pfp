package com.ghjansen.pfp.core;

import com.ghjansen.pfp.catalog.Catalog;
import com.ghjansen.pfp.catalog.Portfolio;
import com.ghjansen.pfp.control.PortfolioController;
import processing.core.PApplet;

public class Core {

    private static PApplet processing;
    private PortfolioController portfolioController;

    public Core(PApplet applet){
        this.processing = applet;
        this.portfolioController = new PortfolioController();
    }

    public static PApplet getProcessing(){
        return processing;
    }

    public void draw(){

    }

    public void registerCatalog(Catalog catalog){
        portfolioController.addCatalog(catalog);
    }

    public void setPortfolio(Portfolio portfolio){
        portfolioController.setPortfolio(portfolio);
    }



}
