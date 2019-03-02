package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.catalog.ColourCatalog;
import com.ghjansen.pfp.component.Colour;

public class ClassicColourCatalog extends ColourCatalog {

    protected void load() {
        addColour("base", new Colour(255));
        addColour("outline", new Colour(187));
        addColour("highlight", new Colour(0));
    }

}
