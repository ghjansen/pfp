package com.ghjansen.pfp.control;

import com.ghjansen.pfp.core.SketchDraw;
import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

public final class ComponentController extends Controller implements SketchSettings, SketchSetup, SketchDraw {

    private ComponentCatalog catalog;

    public ComponentController(ComponentCatalog catalog){
        this.catalog = catalog;
    }

    public void settings() {
        catalog.getFrame().settings();
    }

    public void setup() {
        catalog.getFrame().setup();
    }

    public void draw(){

    }



}
