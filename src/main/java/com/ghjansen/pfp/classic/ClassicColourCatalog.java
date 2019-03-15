package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.portfolio.ColourCatalog;
import com.ghjansen.pfp.component.Colour;

public final class ClassicColourCatalog extends ColourCatalog {

    protected void load() {
        addColour("base", new Colour(255F));
        addColour("outline", new Colour(187F));
        addColour("highlight", new Colour(0F));
    }

}
