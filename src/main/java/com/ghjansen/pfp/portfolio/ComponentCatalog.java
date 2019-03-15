package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.component.Frame;

import java.util.ArrayList;

public abstract class ComponentCatalog extends Catalog<ArrayList<Component>> {

    protected ColourCatalog c;
    protected StyleCatalog s;
    protected BehaviorCatalog b;
    private Frame frame;

    public ComponentCatalog(){
        super(new ArrayList<Component>());
        //if frame was not defined at load() create a default one
        if(frame == null) {
            this.frame = new Frame();
        }
    }

    protected void configureFrameAsWindow(int width, int height, boolean isResizable, boolean is3d, Colour background){
        this.frame = new Frame(width, height, isResizable, is3d, background);
    }

    protected void configureFrameAsFullScreen(boolean is3d, Colour background){
        this.frame = new Frame(true, is3d, background);
    }

    protected void addComponent(Component component){
        catalog.add(component);
    }

    public ArrayList<Component> getComponentCatalog(){
        return catalog;
    }

    public void resolveDependencies(ColourCatalog c, StyleCatalog s, BehaviorCatalog b){
        this.c = c;
        this.s = s;
        this.b = b;
    }

    public Frame getFrame(){
        return this.frame;
    }

}
