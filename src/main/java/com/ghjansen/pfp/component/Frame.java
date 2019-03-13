package com.ghjansen.pfp.component;

import com.ghjansen.pfp.core.Core;
import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.Component;

public class Frame extends Component implements SketchSettings, SketchSetup {

    protected static final int DEFAULT_SIZE = 100;

    protected int width;
    protected int height;
    protected boolean isResizable;
    protected boolean isFullScreen;
    protected boolean is3d;

    public Frame(){
        this.width = DEFAULT_SIZE;
        this.height = DEFAULT_SIZE;
        this.isResizable = false;
        this.isFullScreen = false;
        this.isEnabled = true;
        this.isVisible = true;
        this.is3d = false;
    }

    public Frame(boolean isFullScreen, boolean is3d){
        this.width = 0;
        this.height = 0;
        this.isResizable = false;
        this.isFullScreen = isFullScreen;
        this.isEnabled = true;
        this.isVisible = true;
        this.is3d = is3d;
    }

    public Frame(int width, int height, boolean isResizable, boolean is3d){
        this.width = width;
        this.height = height;
        this.isResizable = isResizable;
        this.isFullScreen = false;
        this.isEnabled = true;
        this.isVisible = true;
        this.is3d = is3d;
    }

    public void content() {
        /*
        fullScreen() must be the first call inside setup() or settings()
        https://processing.org/reference/fullScreen_.html
        --
        also p.getSurface() is null from settings(), so to avoid NPE
        p.getSurface().setResizable(boolean) will be called from setup()
         */
        if(is3d){
            if(isFullScreen){
                p.fullScreen(p.P3D);
            } else if (width == 0 && height == 0) {
                //in case the fullScreen boolean is informed as false
                p.size(DEFAULT_SIZE, DEFAULT_SIZE, p.P3D);
            } else {
                p.size(width, height, p.P3D);
            }
        } else {
            if(isFullScreen){
                p.fullScreen();
            } else if (width == 0 && height == 0) {
                //in case the fullScreen boolean is informed as false
                p.size(DEFAULT_SIZE, DEFAULT_SIZE);
            } else {
                p.size(width, height);
            }
        }

    }

    public void settings(){
        content();
    }

    public void setup(){
        Core.getProcessing().getSurface().setResizable(isResizable);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isResizable() {
        return isResizable;
    }

    public boolean isFullScreen() {
        return isFullScreen;
    }
}
