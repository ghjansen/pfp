package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Point;

public abstract class Component extends Element {

    protected Component parent;
    protected Component child;
    protected Point reference;
    protected boolean isAbsolute;
    protected boolean isEnabled;
    protected boolean isVisible;

    public Component(){
        this.reference = new Point(0,0);
        this.isAbsolute = true;
    }

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
