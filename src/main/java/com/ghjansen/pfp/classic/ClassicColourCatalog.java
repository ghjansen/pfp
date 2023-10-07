package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.portfolio.ColourCatalog;
import com.ghjansen.pfp.component.Colour;

import static com.ghjansen.pfp.classic.ClassicIdentity.*;

public final class ClassicColourCatalog extends ColourCatalog {

    protected void load() {
        addColour(COLOUR_BASE, new Colour(255F));
        addColour(COLOUR_OUTLINE, new Colour(187F));
        addColour(COLOUR_HIGHLIGHT, new Colour(0F));
    }

}
