package com.ghjansen.pfp.engine;

import com.ghjansen.pfp.core.Core;
import processing.core.PApplet;

public class ProcessingEngine extends PApplet implements Engine {

    private final Core core;

    public ProcessingEngine(final Core core) {
        this.core = core;
    }

    public void settings(){
        core.settings();
    }

    public void setup(){
        core.setup();
    }

    public void draw(){
        core.draw();
    }

    @Override
    public void startEngine() {
        runSketch(new String[]{this.getClass().getName()}, this);
    }
}
