package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Point;

import java.util.ArrayList;
import java.util.List;

public abstract class Component extends Element {

    protected Component parent;
    protected List<Component> children;
    protected Point reference;
    protected boolean absolute;
    protected boolean enabled;
    protected boolean visible;

    private Component(Component parent, List<Component> children, Point reference, boolean absolute, boolean enabled, boolean visible){
        this.parent = parent;
        this.children = children;
        this.reference = reference;
        this.absolute = absolute;
        this.enabled = enabled;
        this.visible = visible;
    }

    public Component(){
        this(null, new ArrayList<Component>(), new Point(0,0), true, false, false);
    }

    public Component(Point reference){
        this(null, new ArrayList<Component>(), reference, true, false, false);
    }

    public Component(Point reference, boolean absolute){
        this(null, new ArrayList<Component>(), reference, absolute, false, false);
    }

    public Component getParent() {
        return parent;
    }

    public List<Component> getChildren() {
        return children;
    }

    public Point getReference() {
        return reference;
    }

    public boolean isAbsolute() {
        return absolute;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setParent(Component component){
        this.parent = component;
    }

    public void addChild(Component component){
        children.add(component);
        component.setParent(this);
    }
}
