package com.ghjansen.pfp.component;

import com.ghjansen.pfp.portfolio.Component;

public class Canvas extends Component {

    private Colour background;

    public Canvas(Colour background) {
        this.background = background;
    }

    public void content() {
        p.noStroke();
        if(background != null){
            p.fill(background.getValueWithAlpha());
        }
        p.rect(parent.getReference().getX(), parent.getReference().getY(), p.width, p.height);
    }
}
