package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.component.Frame;

import java.util.ArrayList;

public abstract class ComponentCatalog extends Catalog<ArrayList<Component>> {

    private ColourCatalog c;
    private StyleCatalog s;
    private BehaviorCatalog b;
    private Frame frame;

    public ComponentCatalog() {
        super(new ArrayList<Component>());
        //if frame was not defined at load() create a default one
        if (frame == null) {
            this.frame = new Frame();
        }
    }

    protected void configureFrameAsWindow(int width, int height, boolean resizable, boolean threeDimensional, Colour background) {
        this.frame = new Frame(width, height, resizable, threeDimensional, background);
    }

    protected void configureFrameAsFullScreen(boolean threeDimensional, Colour background) {
        this.frame = new Frame(threeDimensional, background);
    }

    protected void addComponent(Component component) {
        catalog.add(component);
    }

    public ArrayList<Component> getComponentCatalog() {
        return catalog;
    }

    public void assemble(Catalog... dependencies) {
        this.c = (ColourCatalog) dependencies[0];
        this.s = (StyleCatalog) dependencies[1];
        this.b = (BehaviorCatalog) dependencies[2];
        load();
    }

    public Frame getFrame() {
        return this.frame;
    }

    protected Colour colour(Identity identity) {
        return c.getColour(identity);
    }

    protected Element style(Identity identity) {
        return s.getStyle(identity);
    }

    protected Element behavior(String name) {
        return b.getBehavior(name);
    }

}