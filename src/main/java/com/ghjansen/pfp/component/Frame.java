package com.ghjansen.pfp.component;

import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.Component;

public class Frame extends Component implements SketchSettings, SketchSetup {

    protected int initialWidth;
    protected int initialHeight;
    protected boolean resizable;
    protected boolean fullScreen;
    protected boolean threeDimensional;
    protected Colour background;

    /**
     * Frame as Processing's default
     */
    public Frame(){
        this.enabled = true;
        this.visible = true;
        this.initialWidth = p.DEFAULT_WIDTH;
        this.initialHeight = p.DEFAULT_HEIGHT;
        this.resizable = false;
        this.fullScreen = false;
        this.threeDimensional = false;
        this.background = new Colour(p.sketchWindowColor());
    }

    /**
     * Frame as fullscreen
     * @param threeDimensional defines the render of the frame as three dimensional
     * @param background defines the color to fill the frame
     */
    public Frame(boolean threeDimensional, Colour background){
        this.enabled = true;
        this.visible = true;
        this.initialWidth = p.DEFAULT_WIDTH;
        this.initialHeight = p.DEFAULT_HEIGHT;
        this.resizable = false;
        this.fullScreen = true;
        this.threeDimensional = threeDimensional;
        this.background = background;
    }

    /**
     * Frame as window
     * @param initialWidth horizontal size of the frame
     * @param initialHeight vertical size of the frame
     * @param resizable defines the the frame capability to resize
     * @param threeDimensional defines the render of the frame as three dimensional
     * @param background defines the color to fill the frame
     */
    public Frame(int initialWidth, int initialHeight, boolean resizable, boolean threeDimensional, Colour background){
        this.initialWidth = initialWidth;
        this.initialHeight = initialHeight;
        this.resizable = resizable;
        this.fullScreen = false;
        this.enabled = true;
        this.visible = true;
        this.threeDimensional = threeDimensional;
        this.background = background;
    }

    public void content() {
        /*
        fullScreen() must be the first call inside setup() or settings()
        https://processing.org/reference/fullScreen_.html
        --
        also p.getSurface() is null from settings(), so to avoid NPE
        p.getSurface().setResizable(boolean) will be called from setup()
         */
        if(threeDimensional){
            if(fullScreen){
                p.fullScreen(p.P3D);
            } else {
                p.size(initialWidth, initialHeight, p.P3D);
            }
        } else {
            if(fullScreen){
                p.fullScreen();
            } else {
                p.size(initialWidth, initialHeight);
            }
        }
    }

    public void settings(){
        content();
    }

    public void setup(){
        p.getSurface().setResizable(resizable);
        p.background(background.getValue());
    }

    public int getInitialWidth() {
        return initialWidth;
    }

    public int getCurrentWidth(){
        return p.width;
    }

    public int getInitialHeight() {
        return initialHeight;
    }

    public int getCurrentHeight(){
        return p.height;
    }

    public boolean isResizable() {
        return resizable;
    }

    public boolean isFullScreen() {
        return fullScreen;
    }

    public boolean isThreeDimensional() {
        return threeDimensional;
    }

}
