package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.DuplicateNameException;
import com.ghjansen.pfp.exception.ElementNotFoundException;

import java.util.HashMap;

public abstract class StyleCatalog extends Catalog<HashMap<Identity,Element>> {

    private ColourCatalog c;

    public StyleCatalog(){
        super(new HashMap<Identity,Element>());
    }

    protected void addStyle(Identity identity, Element element) {
        if(catalog.containsKey(identity)){
            ExceptionController.getInstance().reportAndExit(new DuplicateNameException("The name \'"+identity+"\' was already used by another element in the style portfolio"));
        } else {
            catalog.put(identity, element);
        }
    }

    public Element getStyle(Identity identity) {
        if(catalog.containsKey(identity)){
            return catalog.get(identity);
        } else {
            ExceptionController.getInstance().reportAndExit(new ElementNotFoundException("No element with name \'"+identity+"\' was found in the style portfolio"));
            return null;
        }
    }

    public void assemble(Catalog ... dependencies){
        this.c = (ColourCatalog) dependencies[0];
        load();
    }

    protected Colour colour(Identity identity){
        return c.getColour(identity);
    }

}
