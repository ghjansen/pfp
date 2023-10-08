package com.ghjansen.pfp.classic;

import com.ghjansen.pfp.portfolio.Element;
import com.ghjansen.pfp.portfolio.StyleCatalog;

import static com.ghjansen.pfp.classic.ClassicIdentity.*;

public final class ClassicStyleCatalog extends StyleCatalog {

    protected void load() {
        addStyle(STYLE_FILL_BASE, new Element() {
            @Override
            public void content() {
                fill(colour(COLOUR_BASE));
            }
        });
        addStyle(STYLE_FILL_OUTLINE, new Element() {
            @Override
            public void content() {
                fill(colour(COLOUR_OUTLINE));
            }
        });
        addStyle(STYLE_FILL_HIGHLIGHT, new Element() {
            @Override
            public void content() {
                fill(colour(COLOUR_HIGHLIGHT));
            }
        });
    }
}
