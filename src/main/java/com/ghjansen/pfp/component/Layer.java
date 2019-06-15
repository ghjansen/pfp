package com.ghjansen.pfp.component;

import com.ghjansen.pfp.portfolio.Component;

public class Layer extends Component {

    private Colour colour;

    public Layer(){
        this.colour = null;
    }

    public Layer(Colour colour){
        this.colour = colour;
    }

    public void content() {
        p.noStroke();
        if(this.colour != null){
            p.fill(this.colour.getValueWithAlpha());
        } else {
            p.noFill();
        }
        p.rect(0,0,p.width,p.height);
    }

}
