package com.ghjansen.pfp.core;

import com.ghjansen.pfp.portfolio.Catalog;
import com.ghjansen.pfp.portfolio.Portfolio;
import com.ghjansen.pfp.control.PortfolioController;
import processing.core.PApplet;

public final class Core implements ProcessingMethods {

    private static PApplet processing;
    private PortfolioController portfolioController;

    public Core(PApplet applet){
        this.processing = applet;
        this.portfolioController = new PortfolioController();
    }

    public static PApplet getProcessing(){
        return processing;
    }

    public void settings(){
        this.portfolioController.settings();
    }

    public void setup(){
        this.portfolioController.setup();
    }

    public void draw(){
        this.portfolioController.draw();
    }

    public void registerCatalog(Catalog catalog){
        this.portfolioController.addCatalog(catalog);
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolioController.setPortfolio(portfolio);
    }



}
