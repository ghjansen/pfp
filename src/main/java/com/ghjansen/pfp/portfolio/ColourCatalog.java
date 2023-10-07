package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.ColourNotFoundException;
import com.ghjansen.pfp.exception.DuplicateNameException;

import java.util.HashMap;

public abstract class ColourCatalog extends Catalog<HashMap<Identity,Colour>> {

    public ColourCatalog(){
        super(new HashMap<Identity,Colour>());
    }

    protected void addColour(Identity identity, Colour colour) {
        if(catalog.containsKey(identity)){
            ExceptionController.getInstance().reportAndExit(new DuplicateNameException("The name \'"+identity+"\' was already used by another colour in the colour portfolio"));
        } else {
            catalog.put(identity, colour);
        }
    }

    public Colour getColour(Identity identity) {
        if(catalog.containsKey(identity)){
            return catalog.get(identity);
        } else {
            ExceptionController.getInstance().reportAndExit(new ColourNotFoundException("No colour with name \'"+identity+"\' was found in the colour portfolio"));
            return null;
        }
    }

}
