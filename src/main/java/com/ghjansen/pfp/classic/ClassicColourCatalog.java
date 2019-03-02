package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.portfolio.ColourCatalog;
import com.ghjansen.pfp.component.Colour;

public final class ClassicColourCatalog extends ColourCatalog {

    protected void load() {
        addColour("base", new Colour(255));
        addColour("outline", new Colour(187));
        addColour("highlight", new Colour(0));
    }

}
