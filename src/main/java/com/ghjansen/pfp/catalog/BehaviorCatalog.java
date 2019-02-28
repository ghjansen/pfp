package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.exception.DuplicateNameException;
import com.ghjansen.pfp.exception.ElementNotFoundException;

import java.util.HashMap;

public abstract class BehaviorCatalog extends Catalog<HashMap<String,Element>> {

    private ColourCatalog c;
    private StyleCatalog s;

    public BehaviorCatalog() {
        super(new HashMap<String,Element>());
    }

    protected void addBehavior(String name, Element element) throws DuplicateNameException{
        if(catalog.containsKey(name)){
            throw new DuplicateNameException("The name \'"+name+"\' was already used by another element in the behavior catalog");
        } else {
            catalog.put(name, element);
        }
    }

    public Element getBehavior(String name) throws ElementNotFoundException {
        if(catalog.containsKey(name)){
            return catalog.get(name);
        } else {
            throw new ElementNotFoundException("No element with name \'"+name+"\' was found in the behavior catalog");
        }
    }

    public void resolveDependencies(ColourCatalog c, StyleCatalog s){
        this.c = c;
        this.s = s;
    }

}
