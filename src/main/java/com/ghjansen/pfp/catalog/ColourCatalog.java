package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.exception.DuplicateNameException;

import java.util.HashMap;

public abstract class ColourCatalog extends Catalog {

    private HashMap<String,Element> localReference;

    public ColourCatalog(){
        super(new HashMap<String,Element>());
        this.localReference = (HashMap<String,Element>) catalog;
    }

    protected void add(String name, Element element) throws DuplicateNameException{
        if(localReference.containsKey(name)){
            throw new DuplicateNameException();
        } else {
            localReference.put(name, element);
        }
    }

}
