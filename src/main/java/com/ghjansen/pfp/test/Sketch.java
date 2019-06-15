package com.ghjansen.pfp.test;

import com.ghjansen.pfp.component.Colour;
import com.ghjansen.pfp.core.Core;
import com.ghjansen.pfp.portfolio.ColourCatalog;
import processing.core.PApplet;

public class Sketch extends PApplet {

    private Core c = new Core(this);

    public static void main(String args[]){
        PApplet.main("com.ghjansen.pfp.test.Sketch");
    }

    public void settings(){
        //size(100,100,P3D);
        //System.out.println("settings: "+System.currentTimeMillis());
        //c = new Core(this);
        //Portfolio portfolio = new Portfolio() {};
        //portfolio.setColourCatalog(new ClassicColourCatalog());
        //portfolio.setStyleCatalog(new ClassicStyleCatalog());
        //portfolio.setBehaviorCatalog(new ClassicBehaviourCatalog());
        //portfolio.setComponentCatalog(new ClassicComponentCatalog());
        //c.setPortfolio(portfolio);
        //c.registerCatalog(new MyColourCatalog());

        c.settings();

        //size(100,100);
    }

    public void setup(){
        //size(500, 500);
        //System.out.println("setup: "+System.currentTimeMillis());
        //fill(120,50,240);
        //getSurface().setResizable(true);

        c.setup();

        //background(0);
    }

    public void draw(){
        //ellipse(initialWidth/2,initialHeight/2,second(),second());
        //c.drawTestForms();
        //noLoop();

        c.draw();

        //translate(0,height/2, -height/4);
        //box(60,80,60);
        //translate(width,0,-width/2);
        //box(60,80,60);
    }
}

class MyColourCatalog extends ColourCatalog {
    public void load(){
        addColour("test", new Colour("#FFFFFF"));
    }
}
