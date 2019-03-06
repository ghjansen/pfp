package com.ghjansen.pfp.core;

import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.WrongMethodCallSequenceException;

public class SketchMethodSynchronizer implements SketchMethods {

    private static final String errorMessage = "The library methods must be invoked in the sequence: \'settings()\' first, " +
            "\'setup()\' after and \'draw()\' last. Make sure that each of one the sketch methods \'settings()\', " +
            "\'setup()\' and \'draw()\' contain one single call to its correspondent method from the library";

    private boolean isSettings;
    private boolean isSetup;
    private boolean isDraw;

    public SketchMethodSynchronizer(){
        this.isSettings = false;
        this.isSetup = false;
        this.isDraw = false;
    }

    public void settings() {
        if(isSettings || isSetup || isDraw){
            abort();
        } else {
            isSettings = true;
        }

    }

    public void setup() {
        if(!isSettings || isSetup || isDraw){
            abort();
        } else {
            isSetup = true;
        }
    }

    public void draw() {
        if(isDraw){
            return;
        } else if(!isSettings || !isSetup){
            abort();
        } else {
            isDraw = true;
        }

    }

    private void abort(){
        ExceptionController.getInstance().reportAndExit(new WrongMethodCallSequenceException(errorMessage));
    }
}
