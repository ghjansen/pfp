package com.ghjansen.pfp.control;

import com.ghjansen.pfp.core.SketchDraw;
import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.Portfolio;

public final class ComponentController extends Controller implements SketchSettings, SketchSetup, SketchDraw {

    private Portfolio portfolio;

    public ComponentController(Portfolio portfolio){
        this.portfolio = portfolio;
    }

    public void settings() {
        portfolio.getComponentCatalog().getFrame().settings();
    }

    public void setup() {
        portfolio.getComponentCatalog().getFrame().setup();
    }

    public void draw(){

    }

}
