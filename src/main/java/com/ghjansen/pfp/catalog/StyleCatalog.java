package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.DuplicateNameException;
import com.ghjansen.pfp.exception.ElementNotFoundException;

import java.util.HashMap;

public abstract class StyleCatalog extends Catalog<HashMap<String,Element>> {

    protected ColourCatalog c;

    public StyleCatalog(){
        super(new HashMap<String,Element>());
    }

    protected void addStyle(String name, Element element) {
        if(catalog.containsKey(name)){
            ExceptionController.getInstance().reportAndExit(new DuplicateNameException("The name \'"+name+"\' was already used by another element in the style catalog"));
        } else {
            catalog.put(name, element);
        }
    }

    public Element getStyle(String name) {
        if(catalog.containsKey(name)){
            return catalog.get(name);
        } else {
            ExceptionController.getInstance().reportAndExit(new ElementNotFoundException("No element with name \'"+name+"\' was found in the style catalog"));
            return null;
        }
    }

    public void resolveDependencies(ColourCatalog c){
        this.c = c;
    }

}
