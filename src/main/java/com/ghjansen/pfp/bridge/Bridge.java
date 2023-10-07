package com.ghjansen.pfp.bridge;

public interface Bridge {

    void background(int rgb);
    void fill(int rgb);
    void fullScreen(String renderer);
    void fullScreen();
    void noFill();
    void noStroke();
    void rect(float a, float b, float c, float d);
    void size(int width, int height, String renderer);
    void size(int width, int height);
    void setResizable(boolean resizable);


}
