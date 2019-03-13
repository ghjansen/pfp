package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Frame;

import java.util.ArrayList;

public abstract class ComponentCatalog extends Catalog<ArrayList<Component>> {

    private ColourCatalog c;
    private StyleCatalog s;
    private BehaviorCatalog b;
    private Frame frame;

    public ComponentCatalog(){
        super(new ArrayList<Component>());
    }

    protected void configureFrameAsWindow(int width, int height, boolean isResizable, boolean is3d){
        this.frame = new Frame(width, height, isResizable, is3d);
    }

    protected void configureFrameAsFullScreen(boolean is3d){
        this.frame = new Frame(true, is3d);
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
