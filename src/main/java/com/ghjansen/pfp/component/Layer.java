package com.ghjansen.pfp.component;

import com.ghjansen.pfp.portfolio.Component;

import java.util.Optional;

public class Layer extends Component {

    private Colour colour;

    public Layer(){
        this.colour = null;
    }

    public Layer(Colour colour){
        this.colour = colour;
    }

    public void content() {
        noStroke();
        noFill();
        Optional.ofNullable(colour)
                .ifPresent(this::fill);
        rect(0,0,sketchWidth(), sketchHeight());
    }

}
