package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

public final class ClassicComponentCatalog extends ComponentCatalog {

    protected void load() {
        configureFrameAsWindow(500, 500, true, false, new Colour(0F));
        //configureFrameAsFullScreen(false, new Colour(0));
    }

}
