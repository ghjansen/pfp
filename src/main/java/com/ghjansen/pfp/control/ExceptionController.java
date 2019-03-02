package com.ghjansen.pfp.control;

public class ExceptionController {

    private static ExceptionController instance = null;

    public static ExceptionController getInstance(){
        if(instance == null){
            instance = new ExceptionController();
        }
        return instance;
    }

    public void report(Throwable t){
        System.out.println(t.getMessage());
        System.exit(-1);
    }
}
