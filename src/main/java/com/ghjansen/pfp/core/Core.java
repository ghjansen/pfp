package com.ghjansen.pfp.core;

import com.ghjansen.pfp.portfolio.Catalog;
import com.ghjansen.pfp.portfolio.Portfolio;
import com.ghjansen.pfp.control.PortfolioController;
import processing.core.PApplet;

public final class Core implements SketchMethods {

    private static PApplet processing;
    private PortfolioController portfolioController;
    private SketchMethodSynchronizer sketchMethodSynchronizer;

    public Core(PApplet applet){
        this.processing = applet;
        this.portfolioController = new PortfolioController();
        this.sketchMethodSynchronizer = new SketchMethodSynchronizer();
    }

    public static PApplet getProcessing(){
        return processing;
    }

    public void settings(){
        this.sketchMethodSynchronizer.settings();
        this.portfolioController.settings();
    }

    public void setup(){
        this.sketchMethodSynchronizer.setup();
        this.portfolioController.setup();
    }

    public void draw(){
        this.sketchMethodSynchronizer.draw();
        this.portfolioController.draw();
    }

    public void registerCatalog(Catalog catalog){
        this.portfolioController.addCatalog(catalog);
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolioController.setPortfolio(portfolio);
    }



}
