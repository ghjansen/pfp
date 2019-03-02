package com.ghjansen.pfp.exception;

public final class DuplicateNameException extends Throwable {

    public DuplicateNameException(){
        super();
    }

    public DuplicateNameException(String message){
        super(message);
    }
}
