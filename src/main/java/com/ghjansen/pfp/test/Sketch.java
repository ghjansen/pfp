package com.ghjansen.pfp.test;

import com.ghjansen.pfp.classic.ClassicBehaviourCatalog;
import com.ghjansen.pfp.classic.ClassicColourCatalog;
import com.ghjansen.pfp.classic.ClassicComponentCatalog;
import com.ghjansen.pfp.classic.ClassicStyleCatalog;
import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.core.Core;
import com.ghjansen.pfp.portfolio.ColourCatalog;
import com.ghjansen.pfp.portfolio.Portfolio;
import processing.core.PApplet;

public class Sketch extends PApplet {

    private Core c;

    public static void main(String args[]){
        PApplet.main("com.ghjansen.pfp.test.Sketch");
    }

    public void settings(){
        //size(300,300);
        //System.out.println("settings: "+System.currentTimeMillis());
        //c = new Core(this);
        //Portfolio portfolio = new Portfolio() {};
        //portfolio.setColourCatalog(new ClassicColourCatalog());
        //portfolio.setStyleCatalog(new ClassicStyleCatalog());
        //portfolio.setBehaviorCatalog(new ClassicBehaviourCatalog());
        //portfolio.setComponentCatalog(new ClassicComponentCatalog());
        //c.setPortfolio(portfolio);
        c = new Core(this);
        c.registerCatalog(new MyColourCatalog());
        c.settings();
    }

    public void setup(){
        //size(500, 500);
        //System.out.println("setup: "+System.currentTimeMillis());
        //fill(120,50,240);
        //getSurface().setResizable(true);
        c.setup();
    }

    public void draw(){
        //ellipse(width/2,height/2,second(),second());
        //c.drawTestForms();
        //noLoop();
        c.draw();
    }
}

class MyColourCatalog extends ColourCatalog {
    public void load(){
        addColour("test", new Colour("#FFFFFF"));
    }
}
