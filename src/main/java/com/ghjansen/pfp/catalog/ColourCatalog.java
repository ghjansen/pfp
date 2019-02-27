package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.exception.DuplicateNameException;

import java.util.HashMap;

public abstract class ColourCatalog extends Catalog<HashMap<String,Element>> {

    public ColourCatalog(){
        super(new HashMap<String,Element>());
    }

    protected void add(String name, Element element) throws DuplicateNameException{
        if(catalog.containsKey(name)){
            throw new DuplicateNameException("The name \'"+name+"\' was already used by another element in the colour catalog");
        } else {
            catalog.put(name, element);
        }
    }

}
