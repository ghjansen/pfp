package com.ghjansen.pfp.exception;

public class InvalidColourException extends Throwable {

    public InvalidColourException(){
        super();
    }

    public InvalidColourException(String message){
        super(message);
    }
}
