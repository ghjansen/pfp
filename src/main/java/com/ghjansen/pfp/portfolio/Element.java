package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.api.ProcessingBasedAPI;
import com.ghjansen.pfp.core.Core;
import com.ghjansen.pfp.engine.ProcessingEngine;

public abstract class Element extends ProcessingBasedAPI {

    protected Element() {
        super((ProcessingEngine) Core.getEngine());
    }

    public abstract void content();

}
