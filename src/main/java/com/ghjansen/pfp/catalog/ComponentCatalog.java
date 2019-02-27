package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.component.Component;

import java.util.ArrayList;

public abstract class ComponentCatalog extends Catalog<ArrayList<Element>> {

    public ComponentCatalog(){
        super(new ArrayList<Element>());
    }

    protected void add(Component component){
        catalog.add(component);
    }

}
