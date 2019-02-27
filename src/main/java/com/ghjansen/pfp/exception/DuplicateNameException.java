package com.ghjansen.pfp.exception;

public class DuplicateNameException extends Throwable {

    public DuplicateNameException(){
        super();
    }

    public DuplicateNameException(String message){
        super(message);
    }
}
