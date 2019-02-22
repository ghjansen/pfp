package com.ghjansen.pfp.control;

public class ThemeController {

    private StyleController styleController;
    private BehaviorController behaviorController;

    public ThemeController(StyleController styleController, BehaviorController behaviorController){
        this.styleController = styleController;
        this.behaviorController = behaviorController;
    }
}
