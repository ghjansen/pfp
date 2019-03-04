package com.ghjansen.pfp.control;

import com.ghjansen.pfp.portfolio.Portfolio;

public final class ComponentController {

    private Portfolio portfolio;

    public ComponentController(Portfolio portfolio){
        this.portfolio = portfolio;
        calibrateSettings();
    }

    private void calibrateSettings(){
        portfolio.getComponentCatalog().getFrame().content();
    }

    public void calibrateSetup(){
        portfolio.getComponentCatalog().getFrame().setupResizable();
    }

    public void draw(){

    }

}
