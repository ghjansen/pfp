package com.ghjansen.pfp.exception;

public class ColourNotFoundException extends Throwable {

    public ColourNotFoundException(){
        super();
    }

    public ColourNotFoundException(String message){
        super(message);
    }
}
