package com.ghjansen.pfp.control;

import com.ghjansen.pfp.portfolio.Portfolio;

public final class ComponentController extends Controller {

    private Portfolio portfolio;

    public ComponentController(Portfolio portfolio){
        this.portfolio = portfolio;
    }

    public void settings() {
        portfolio.getComponentCatalog().getFrame().content();
    }

    public void setup() {
        portfolio.getComponentCatalog().getFrame().setupResizable();
    }

    public void draw(){

    }

}
