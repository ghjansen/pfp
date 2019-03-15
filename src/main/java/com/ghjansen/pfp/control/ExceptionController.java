package com.ghjansen.pfp.control;

public final class ExceptionController {

    private static ExceptionController instance = null;

    public static ExceptionController getInstance(){
        if(instance == null){
            instance = new ExceptionController();
        }
        return instance;
    }

    public void reportAndExit(Throwable t){
        report(t);
        System.exit(1);
    }

    public void report(Throwable t){
        t.printStackTrace();
    }
}
