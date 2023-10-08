package com.ghjansen.pfp.bridge;

import com.ghjansen.pfp.engine.ProcessingEngine;

public abstract class ProcessingBridge implements Bridge{

    private final ProcessingEngine engine;

    protected ProcessingBridge(ProcessingEngine engine) {
        this.engine = engine;
    }

    protected ProcessingEngine getEngine(){
        return this.engine;
    }

    @Override
    public void background(int rgb) {
        this.engine.background(rgb);
    }

    @Override
    public int defaultWidth() {
        return ProcessingEngine.DEFAULT_WIDTH;
    }

    @Override
    public int defaultHeight() {
        return ProcessingEngine.DEFAULT_HEIGHT;
    }

    @Override
    public void fill(int rgb) {
        this.engine.fill(rgb);
    }

    @Override
    public void fullScreen(String renderer) {
        this.engine.fullScreen(renderer);
    }

    @Override
    public void fullScreen() {
        this.engine.fullScreen();
    }

    @Override
    public void noFill() {
        this.engine.noFill();
    }

    @Override
    public void noStroke() {
        this.engine.noStroke();
    }

    @Override
    public String p3d() {
        return this.engine.P3D;
    }

    @Override
    public void rect(float a, float b, float c, float d) {
        this.engine.rect(a, b, c, d);
    }

    @Override
    public void size(int width, int height, String renderer) {
        this.engine.size(width, height, renderer);
    }

    @Override
    public void size(int width, int height) {
        this.engine.size(width, height);
    }

    @Override
    public void setResizable(boolean resizable) {
        this.engine.getSurface().setResizable(resizable);
    }

    @Override
    public int sketchWidth() {
        return this.engine.sketchWidth();
    }

    @Override
    public int sketchHeight() {
        return this.engine.sketchHeight();
    }

    @Override
    public int sketchWindowColor() {
        return this.engine.sketchWindowColor();
    }
}
