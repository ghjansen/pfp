package com.ghjansen.pfp.component;

import com.ghjansen.pfp.core.SketchSettings;
import com.ghjansen.pfp.core.SketchSetup;
import com.ghjansen.pfp.portfolio.Component;

public class Frame extends Component implements SketchSettings, SketchSetup {

    protected int initialWidth;
    protected int initialHeight;
    protected boolean isResizable;
    protected boolean isFullScreen;
    protected boolean is3d;

    public Frame(){
        this.initialWidth = p.DEFAULT_WIDTH;
        this.initialHeight = p.DEFAULT_HEIGHT;
        this.isResizable = false;
        this.isFullScreen = false;
        this.isEnabled = true;
        this.isVisible = true;
        this.is3d = false;
    }

    public Frame(boolean isFullScreen, boolean is3d){
        this.isResizable = false;
        this.isFullScreen = isFullScreen;
        this.isEnabled = true;
        this.isVisible = true;
        this.is3d = is3d;
    }

    public Frame(int initialWidth, int initialHeight, boolean isResizable, boolean is3d){
        this.initialWidth = initialWidth;
        this.initialHeight = initialHeight;
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
            } else if (initialWidth == 0 && initialHeight == 0) {
                //in case the fullScreen boolean is informed as false
                p.size(p.DEFAULT_WIDTH, p.DEFAULT_WIDTH, p.P3D);
            } else {
                p.size(initialWidth, initialHeight, p.P3D);
            }
        } else {
            if(isFullScreen){
                p.fullScreen();
            } else if (initialWidth == 0 && initialHeight == 0) {
                //in case the fullScreen boolean is informed as false
                p.size(p.DEFAULT_WIDTH, p.DEFAULT_WIDTH);
            } else {
                p.size(initialWidth, initialHeight);
            }
        }
    }

    public void settings(){
        content();
    }

    public void setup(){
        p.getSurface().setResizable(isResizable);
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
        return isResizable;
    }

    public boolean isFullScreen() {
        return isFullScreen;
    }

    public boolean isIs3d() {
        return is3d;
    }

}
