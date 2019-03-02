package com.ghjansen.pfp.portfolio;

import com.ghjansen.pfp.core.Core;
import processing.core.PApplet;

public abstract class Element {

    protected PApplet p = Core.getProcessing();

    public abstract void content();

}
