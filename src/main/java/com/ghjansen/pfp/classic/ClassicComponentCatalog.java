package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.component.Canvas;
import com.ghjansen.pfp.component.Layer;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

import static com.ghjansen.pfp.classic.ClassicIdentity.COLOUR_BASE;
import static com.ghjansen.pfp.classic.ClassicIdentity.COLOUR_HIGHLIGHT;

public final class ClassicComponentCatalog extends ComponentCatalog {

    protected void load() {
        configureFrameAsWindow(500, 500, true, false, colour(COLOUR_BASE));
        //configureFrameAsFullScreen(true, colour("base"));

        Canvas canvas = new Canvas(colour(COLOUR_BASE));
        Layer l1 = new Layer(colour(COLOUR_HIGHLIGHT));
        l1.setVisible(true);
        canvas.addChild(l1);
        addComponent(canvas);
    }

}
