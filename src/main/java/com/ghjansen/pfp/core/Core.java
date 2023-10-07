package com.ghjansen.pfp.core;

import com.ghjansen.pfp.engine.Engine;
import com.ghjansen.pfp.engine.ProcessingEngine;
import com.ghjansen.pfp.portfolio.Catalog;
import com.ghjansen.pfp.portfolio.Portfolio;
import com.ghjansen.pfp.control.PortfolioController;

public final class Core implements SketchSettings, SketchSetup, SketchDraw {

    private static Engine engine;
    private PortfolioController portfolioController;
    private SketchMethodSynchronizer sketchMethodSynchronizer;

    public Core(){
        engine = new ProcessingEngine(this);
        this.sketchMethodSynchronizer = new SketchMethodSynchronizer();
        this.portfolioController = new PortfolioController();
        engine.startEngine();
    }

    public static Engine getEngine() {
        return engine;
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
