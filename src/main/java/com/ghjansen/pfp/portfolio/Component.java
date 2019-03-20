package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Point;

import java.util.ArrayList;

public abstract class Component extends Element {

    protected Component parent;
    protected ArrayList<Component> children;
    protected Point reference;
    protected boolean isAbsolute;
    protected boolean isEnabled;
    protected boolean isVisible;

    private Component(Component parent, ArrayList<Component> children, Point reference, boolean isAbsolute, boolean isEnabled, boolean isVisible){
        this.parent = parent;
        this.children = children;
        this.reference = reference;
        this.isAbsolute = isAbsolute;
        this.isEnabled = isEnabled;
        this.isVisible = isVisible;
    }

    public Component(){
        this(null, new ArrayList<Component>(), new Point(0,0), true, false, false);
    }

    public Component(Point reference){
        this(null, new ArrayList<Component>(), reference, true, false, false);
    }

    public Component(Point reference, boolean isAbsolute){
        this(null, new ArrayList<Component>(), reference, isAbsolute, false, false);
    }

    public Component getParent() {
        return parent;
    }

    public ArrayList<Component> getChildren() {
        return children;
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

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public void setParent(Component component){
        this.parent = component;
    }

    public void addChild(Component component){
        children.add(component);
    }
}
