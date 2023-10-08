package com.ghjansen.pfp.bridge;

public interface Operations {

    void background(int rgb);
    int defaultWidth();
    int defaultHeight();
    void fill(int rgb);
    void fullScreen(String renderer);
    void fullScreen();
    void noFill();
    void noStroke();
    String p3d();
    void rect(float a, float b, float c, float d);
    void size(int width, int height, String renderer);
    void size(int width, int height);
    void setResizable(boolean resizable);
    int sketchWidth();
    int sketchHeight();
    int sketchWindowColor();

}
