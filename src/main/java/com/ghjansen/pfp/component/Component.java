package com.ghjansen.pfp.component;

import com.ghjansen.pfp.catalog.Element;
import processing.core.PApplet;

public abstract class Component extends Element {

    private Component parent;
    private Component child;
    private Point reference;
    private boolean isAbsolute;
    private boolean isEnabled;
    private boolean isVisible;

    public Component(Point reference){
        
    }

    public Component getParent() {
        return parent;
    }

    public Component getChild() {
        return child;
    }

    public Point getReference() {
        return reference;
    }

    public boolean isAbsolute() {
        return isAbsolute;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public boolean isVisible() {
        return isVisible;
    }
}
