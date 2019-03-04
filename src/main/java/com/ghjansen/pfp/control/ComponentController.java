package com.ghjansen.pfp.control;

import com.ghjansen.pfp.portfolio.Portfolio;

public final class ComponentController {

    private Portfolio portfolio;

    public ComponentController(Portfolio portfolio){
        this.portfolio = portfolio;
        calibrate();
    }

    private void calibrate(){
        portfolio.getComponentCatalog().getFrame().content();
    }

    public void draw(){

    }

}
