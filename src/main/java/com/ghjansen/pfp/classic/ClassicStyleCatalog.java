package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.portfolio.Element;
import com.ghjansen.pfp.portfolio.StyleCatalog;

public final class ClassicStyleCatalog extends StyleCatalog {

    protected void load() {
        addStyle("fillBase", new Element() {
            @Override
            public void content() {
                p.fill(colour("base").getValue());
            }
        });
        addStyle("fillOutline", new Element() {
            @Override
            public void content() {
                p.fill(colour("outline").getValue());
            }
        });
        addStyle("fillHighlight", new Element() {
            @Override
            public void content() {
                p.fill(colour("highlight").getValue());
            }
        });
    }
}
