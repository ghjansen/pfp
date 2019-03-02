package com.ghjansen.pfp.component;

import com.ghjansen.pfp.portfolio.Component;

public class Frame extends Component {

    protected static final int DEFAULT_SIZE = 100;

    protected final int width;
    protected final int height;
    protected final boolean isResizable;
    protected final boolean isFullScreen;

    public Frame(){
        this.width = DEFAULT_SIZE;
        this.height = DEFAULT_SIZE;
        this.isResizable = false;
        this.isFullScreen = false;
        this.isEnabled = true;
        this.isVisible = true;
    }

    public Frame(boolean isFullScreen){
        this.width = 0;
        this.height = 0;
        this.isResizable = false;
        this.isFullScreen = isFullScreen;
        this.isEnabled = true;
        this.isVisible = true;
    }

    public Frame(int width, int height, boolean isResizable){
        this.width = width;
        this.height = height;
        this.isResizable = isResizable;
        this.isFullScreen = false;
        this.isEnabled = true;
        this.isVisible = true;
    }

    public void content() {
        /*
        fullScreen() must be the first call inside setup() or settings()
        https://processing.org/reference/fullScreen_.html
         */
        if(isFullScreen){
            p.fullScreen();
        } else if (width == 0 && height == 0) {
            //in case the fullScreen boolean is informed as false
            p.size(DEFAULT_SIZE, DEFAULT_SIZE);
            p.getSurface().setResizable(isResizable);
        } else {
            p.size(width, height);
            p.getSurface().setResizable(isResizable);
        }
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
