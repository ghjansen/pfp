package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.DuplicateNameException;
import com.ghjansen.pfp.exception.ElementNotFoundException;

import java.util.HashMap;

public abstract class BehaviorCatalog extends Catalog<HashMap<String,Element>> {

    private ColourCatalog c;
    private StyleCatalog s;

    public BehaviorCatalog() {
        super(new HashMap<String,Element>());
    }

    protected void addBehavior(String name, Element element) {
        if(catalog.containsKey(name)){
            ExceptionController.getInstance().reportAndExit(new DuplicateNameException("The name \'"+name+"\' was already used by another element in the behavior portfolio"));
        } else {
            catalog.put(name, element);
        }
    }

    public Element getBehavior(String name) {
        if(catalog.containsKey(name)){
            return catalog.get(name);
        } else {
            ExceptionController.getInstance().reportAndExit(new ElementNotFoundException("No element with name \'"+name+"\' was found in the behavior portfolio"));
            return null;
        }
    }

    public void assemble(Catalog ... dependencies){
        this.c = (ColourCatalog) dependencies[0];
        this.s = (StyleCatalog) dependencies[1];
        load();
    }

}
