package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.exception.DuplicateNameException;

import java.util.HashMap;

public abstract class BehaviorCatalog extends Catalog<HashMap<String,Element>> {

    public BehaviorCatalog() {
        super(new HashMap<String,Element>());
    }

    protected void add(String name, Element element) throws DuplicateNameException{
        if(catalog.containsKey(name)){
            throw new DuplicateNameException();
        } else {
            catalog.put(name, element);
        }
    }
}
