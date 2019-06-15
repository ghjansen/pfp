package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.component.Canvas;
import com.ghjansen.pfp.component.Layer;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

public final class ClassicComponentCatalog extends ComponentCatalog {

    protected void load() {
        configureFrameAsWindow(500, 500, true, false, colour("base"));
        //configureFrameAsFullScreen(true, colour("base"));

        Canvas canvas = new Canvas(colour("outline"));
        Layer l1 = new Layer(colour("highlight"));
        l1.setVisible(true);
        canvas.addChild(l1);
        addComponent(canvas);
    }

}
