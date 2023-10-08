package com.ghjansen.pfp.component;

import com.ghjansen.pfp.portfolio.Component;

public class Canvas extends Component {

    private Colour background;

    public Canvas(Colour background) {
        this.background = background;
    }

    public void content() {
        noStroke();
        if(background != null){
            fill(background);
        }
        rect(parent.getReference().getX(), parent.getReference().getY(), sketchWidth(), sketchHeight());
    }
}
