package com.ghjansen.pfp.core;

import com.ghjansen.pfp.catalog.BehaviorCatalog;
import com.ghjansen.pfp.catalog.Profile;
import com.ghjansen.pfp.catalog.StyleCatalog;
import com.ghjansen.pfp.control.ComponentController;
import com.ghjansen.pfp.control.ProfileController;
import processing.core.PApplet;

public class Core {

    private PApplet processing;
    private ProfileController tc;
    private ComponentController cc;

    public Core(PApplet applet){
        this.processing = applet;

        //default block
        //TODO constructors that allow implementations other than default
        StyleCatalog defaultStyleCatalog = new StyleCatalog();
        BehaviorCatalog defaultBehaviorCatalog = new BehaviorCatalog();
        Profile defaultProfile = new Profile(defaultStyleCatalog, defaultBehaviorCatalog);

        this.tc = new ProfileController(defaultProfile);
        this.cc = new ComponentController(tc);
    }

    public void draw(){

    }

    public void drawTestForms(){
        processing.line(0,0,50,50);
        processing.rect(0,0,10,10);
    }

}
