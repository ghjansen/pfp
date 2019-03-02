package com.ghjansen.pfp.test;

import com.ghjansen.pfp.core.Core;
import processing.core.PApplet;

public class Sketch extends PApplet {

    private Core c;

    public static void main(String args[]){
        PApplet.main("com.ghjansen.pfp.test.Sketch");
    }

    public void settings(){
        //size(300,300);
        System.out.println("settings: "+System.currentTimeMillis());
    }

    public void setup(){
        size(500, 500);
        System.out.println("setup: "+System.currentTimeMillis());
        fill(120,50,240);
        c = new Core(this);
    }

    public void draw(){
        ellipse(width/2,height/2,second(),second());
        //c.drawTestForms();
        //noLoop();

    }
}
