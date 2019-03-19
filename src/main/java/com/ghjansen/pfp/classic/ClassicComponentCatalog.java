package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.component.Layer;
import com.ghjansen.pfp.portfolio.ComponentCatalog;

public final class ClassicComponentCatalog extends ComponentCatalog {

    protected void load() {
        configureFrameAsWindow(500, 500, true, false, colour("base"));
        //configureFrameAsFullScreen(false, colour("base"));

        Layer l1 = new Layer(colour("outline"));
        Layer l2 = new Layer(colour("highlight"));
        Layer l3 = new Layer(colour("base"));
        l1.setEnabled(true);

        addComponent(l1);
        addComponent(l2);
        addComponent(l3);

    }

}
