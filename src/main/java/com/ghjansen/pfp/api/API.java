package com.ghjansen.pfp.api;

import com.ghjansen.pfp.bridge.Operations;
import com.ghjansen.pfp.component.Colour;

public interface API extends Operations {

    void fill(Colour colour);

}
