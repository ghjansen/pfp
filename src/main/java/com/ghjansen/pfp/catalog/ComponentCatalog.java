package com.ghjansen.pfp.catalog;

import java.util.HashMap;

public abstract class ComponentCatalog extends Catalog {

    private int elementCounter;
    private HashMap<Integer,Element> localReference;

    public ComponentCatalog(){
        super(new HashMap<Integer,Element>());
        this.localReference = (HashMap<Integer,Element>) catalog;
    }

    protected void add(Element element){
        localReference.put(elementCounter++,element);
    }

}
