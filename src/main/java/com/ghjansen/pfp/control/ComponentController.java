package com.ghjansen.pfp.control;

import com.ghjansen.pfp.component.Layer;
import com.ghjansen.pfp.core.SketchDraw;
import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.Component;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

public final class ComponentController extends Controller implements SketchSettings, SketchSetup, SketchDraw {

    private ComponentCatalog catalog;
    private Layer activeLayer;

    public ComponentController(ComponentCatalog catalog){
        this.catalog = catalog;
    }

    public void settings() {
        catalog.getFrame().settings();
        prepareComponents();
    }

    public void setup() {
        catalog.getFrame().setup();
    }

    public void draw(){
        if(this.activeLayer != null){
            this.activeLayer.content();
        } else {
            for(Component com : catalog.getComponentCatalog()){
                if(com.isVisible()){
                    com.content();
                }
            }
        }
    }

    private void prepareComponents(){
        for(Component com : catalog.getComponentCatalog()){
            catalog.getFrame().addChild(com);
            com.setParent(catalog.getFrame());
            if(com.getClass().equals(Layer.class)){
                if(com.isEnabled() || this.activeLayer == null || this.activeLayer.isEnabled() == false){
                    this.activeLayer = (Layer) com;
                }
            }
        }
        if(this.activeLayer != null){
            this.activeLayer.setEnabled(true);
            this.activeLayer.setVisible(true);
        }
    }



}
