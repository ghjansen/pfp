package com.ghjansen.pfp.api;

import com.ghjansen.pfp.bridge.ProcessingBridge;
import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.engine.ProcessingEngine;

public class ProcessingBasedAPI extends ProcessingBridge implements API {

    protected ProcessingBasedAPI(ProcessingEngine engine) {
        super(engine);
    }

    @Override
    public void fill(Colour colour) {
        getEngine().fill(colour.getValue());
    }
}
