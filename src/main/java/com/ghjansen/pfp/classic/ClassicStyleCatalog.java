package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.portfolio.Element;
import com.ghjansen.pfp.portfolio.StyleCatalog;

public final class ClassicStyleCatalog extends StyleCatalog {

    protected void load() {
        addStyle("fillBase", new Element() {
            @Override
            public void content() {
                p.fill(c.getColour("base").getValue());
            }
        });
        addStyle("fillOutline", new Element() {
            @Override
            public void content() {
                p.fill(c.getColour("outline").getValue());
            }
        });
        addStyle("fillHighlight", new Element() {
            @Override
            public void content() {
                p.fill(c.getColour("highlight").getValue());
            }
        });
    }
}
