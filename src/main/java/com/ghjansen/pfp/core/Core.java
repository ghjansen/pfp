package com.ghjansen.pfp.core;

import com.ghjansen.pfp.control.BehaviorController;
import com.ghjansen.pfp.control.ComponentController;
import com.ghjansen.pfp.control.StyleController;
import processing.core.PApplet;

public class Core {

    private Processing processing;

    private StyleController sc;
    private BehaviorController bc;
    private ComponentController cc;

    public Core(PApplet applet){
        this.processing = (Processing) applet;
        this.sc = new StyleController();
        this.bc = new BehaviorController();
        this.cc = new ComponentController();
    }
}
