package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.component.Layer;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

public final class ClassicComponentCatalog extends ComponentCatalog {

    protected void load() {
        configureFrameAsWindow(500, 500, true, false, c.getColour("base"));
        //configureFrameAsFullScreen(false, c.getColour("base"));
        addComponent(new Layer(c.getColour("outline")));

    }

}
