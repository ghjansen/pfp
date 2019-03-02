package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.ColourNotFoundException;
import com.ghjansen.pfp.exception.DuplicateNameException;

import java.util.HashMap;

public abstract class ColourCatalog extends Catalog<HashMap<String,Colour>> {

    public ColourCatalog(){
        super(new HashMap<String,Colour>());
    }

    protected void addColour(String name, Colour colour) {
        if(catalog.containsKey(name)){
            ExceptionController.getInstance().reportAndExit(new DuplicateNameException("The name \'"+name+"\' was already used by another colour in the colour portfolio"));
        } else {
            catalog.put(name, colour);
        }
    }

    public Colour getColour(String name) {
        if(catalog.containsKey(name)){
            return catalog.get(name);
        } else {
            ExceptionController.getInstance().reportAndExit(new ColourNotFoundException("No colour with name \'"+name+"\' was found in the colour portfolio"));
            return null;
        }
    }

}
