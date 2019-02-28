package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.component.Component;

import java.util.ArrayList;

public abstract class ComponentCatalog extends Catalog<ArrayList<Component>> {

    private ColourCatalog c;
    private StyleCatalog s;
    private BehaviorCatalog b;

    public ComponentCatalog(){
        super(new ArrayList<Component>());
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

}
