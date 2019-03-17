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

    public Component(){
        this.reference = new Point(0,0);
        this.isAbsolute = true;
        this.children = new ArrayList<Component>();
    }

    public Component(Point reference){
        
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
