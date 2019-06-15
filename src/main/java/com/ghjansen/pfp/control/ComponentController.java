package com.ghjansen.pfp.control;

import com.ghjansen.pfp.component.Canvas;
import com.ghjansen.pfp.component.Layer;
import com.ghjansen.pfp.core.SketchDraw;
import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.Component;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

public final class ComponentController extends Controller implements SketchSettings, SketchSetup, SketchDraw {

    private ComponentCatalog catalog;
    private Canvas activeCanvas;

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
        if(activeCanvas != null){
            recursiveDraw(activeCanvas);
        } else {
            for(Component com : catalog.getComponentCatalog()){
                if(com.isVisible()){
                    com.content();
                }
            }
        }
    }

    private void recursiveDraw(Component component){
        if(component.isVisible()){
            component.content();
            for(Component c : component.getChildren()){
                recursiveDraw(c);
            }
        }
    }

    private void prepareComponents(){
        for(Component com : catalog.getComponentCatalog()){
            catalog.getFrame().addChild(com);
            if(com.getClass().equals(Canvas.class)){
                if(com.isEnabled() || activeCanvas == null || activeCanvas.isEnabled() == false){
                    activeCanvas = (Canvas) com;
                }
            }
        }
        if(activeCanvas != null){
            activeCanvas.setEnabled(true);
            activeCanvas.setVisible(true);
        }
    }
}
