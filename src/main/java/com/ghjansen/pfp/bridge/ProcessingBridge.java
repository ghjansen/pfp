package com.ghjansen.pfp.bridge;

import processing.core.PApplet;

public class ProcessingBridge implements Bridge{

    private final PApplet engine;

    public ProcessingBridge(PApplet engine) {
        this.engine = engine;
    }

    @Override
    public void background(int rgb) {
        this.engine.background(rgb);
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
}
