package com.ghjansen.pfp.core;

import com.ghjansen.pfp.control.BehaviorController;
import com.ghjansen.pfp.control.ComponentController;
import com.ghjansen.pfp.control.StyleController;
import com.ghjansen.pfp.control.ThemeController;
import processing.core.PApplet;

public class Core {

    private PApplet processing;
    private ThemeController tc;
    private ComponentController cc;

    public Core(PApplet applet){
        this.processing = applet;
        this.tc = new ThemeController();
        this.cc = new ComponentController(tc);
    }

    public void draw(){

    }

    public void drawTestForms(){
        processing.line(0,0,50,50);
        processing.rect(0,0,10,10);
    }

}
