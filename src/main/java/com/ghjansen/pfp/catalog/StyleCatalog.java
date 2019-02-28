package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.exception.DuplicateNameException;
import com.ghjansen.pfp.exception.ElementNotFoundException;

import java.util.HashMap;

public abstract class StyleCatalog extends Catalog<HashMap<String,Element>> {

    private ColourCatalog c;

    public StyleCatalog(){
        super(new HashMap<String,Element>());
    }

    protected void addStyle(String name, Element element) throws DuplicateNameException{
        if(catalog.containsKey(name)){
            throw new DuplicateNameException("The name \'"+name+"\' was already used by another element in the style catalog");
        } else {
            catalog.put(name, element);
        }
    }

    public Element getStyle(String name) throws ElementNotFoundException {
        if(catalog.containsKey(name)){
            return catalog.get(name);
        } else {
            throw new ElementNotFoundException("No element with name \'"+name+"\' was found in the style catalog");
        }
    }

    public void resolveDependencies(ColourCatalog c){
        this.c = c;
    }

}
