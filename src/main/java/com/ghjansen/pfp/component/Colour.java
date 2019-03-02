package com.ghjansen.pfp.component;

import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.InvalidColourException;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class Colour {

    private static final float CHANNEL_DEC_MAX = 255;
    private static final float CHANNEL_DEC_MIN = 0;
    private static final String CHANNEL_HEX_MAX = "FF";
    private static final String CHANNEL_HEX_FORMAT = "%02X";
    private static final String HEX_PATTERN = "^#?(?:[0-9a-fA-F]{2}){3,4}$";
    private Pattern hexValidator;

    //decimal channels
    private float red;
    private float green;
    private float blue;
    private float alpha;
    private int value;

    //hexadecimal channels
    private String redHex;
    private String greenHex;
    private String blueHex;
    private String alphaHex;
    private String valueHex;

    public Colour(float grey) {
        this(grey, grey, grey);
    }

    public Colour(float grey, float alpha) {
        this(grey, grey, grey, alpha);
    }

    public Colour(float red, float green, float blue) {
        initializeFromDecimal(red, blue, green, CHANNEL_DEC_MAX);
    }

    public Colour(float red, float green, float blue, float alpha) {
        initializeFromDecimal(red, blue, green, alpha);
    }

    public Colour(String hexadecimal) {
        initializeFromHexadecimal(hexadecimal);
    }

    private void initializeFromDecimal(float red, float green, float blue, float alpha) {
        validadeFromDecimal(red, green, blue, alpha);
        setColourFromDecimal(red, green, blue, alpha);
    }

    private void initializeFromHexadecimal(String hexadecimal) {
        validateFromHexadecimal(hexadecimal);
        setColourFromHexadecimal(hexadecimal);
    }

    private void validadeFromDecimal(float red, float green, float blue, float alpha) {
        boolean r = CHANNEL_DEC_MIN <= red && red <= CHANNEL_DEC_MAX;
        boolean g = CHANNEL_DEC_MIN <= green && green <= CHANNEL_DEC_MAX;
        boolean b = CHANNEL_DEC_MIN <= blue && blue <= CHANNEL_DEC_MAX;
        boolean a = CHANNEL_DEC_MIN <= alpha && alpha <= CHANNEL_DEC_MAX;
        if(r && g && b && a == false){
            ExceptionController.getInstance().report(new InvalidColourException("At least one channel informed is not between the range "+ CHANNEL_DEC_MIN +" and "+ CHANNEL_DEC_MAX));
        }
    }

    private void validateFromHexadecimal(String hexadecimal) {
        hexValidator = Pattern.compile(HEX_PATTERN);
        if(!hexValidator.matcher(hexadecimal).matches()){
            ExceptionController.getInstance().report(new InvalidColourException("The hexadecimal value informed does not match with the pattern "+HEX_PATTERN));
        }
    }

    private void setColourFromDecimal(float red, float green, float blue, float alpha){
        //set channels
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
        this.redHex = String.format(CHANNEL_HEX_FORMAT, (int) red);
        this.greenHex = String.format(CHANNEL_HEX_FORMAT, (int)  green);
        this.blueHex = String.format(CHANNEL_HEX_FORMAT, (int) blue);
        this.alphaHex = String.format(CHANNEL_HEX_FORMAT, (int) alpha);
        //set values
        final String noPrefixHex = redHex + greenHex + blueHex;
        this.value = Integer.parseInt(noPrefixHex, 16);
        this.valueHex = "#" + noPrefixHex;
    }

    private void setColourFromHexadecimal(String hexadecimal){
        String noPrefixHex = hexadecimal.replace("#", "").toUpperCase();
        final char charHex[] = noPrefixHex.toCharArray();
        //set channels
        if(charHex.length == 6){
            //without alpha
            this.redHex = String.valueOf(charHex[0]) + String.valueOf(charHex[1]);
            this.greenHex = String.valueOf(charHex[2]) + String.valueOf(charHex[3]);
            this.blueHex = String.valueOf(charHex[4]) + String.valueOf(charHex[5]);
            this.alphaHex = CHANNEL_HEX_MAX;
        } else {
            //with alpha
            this.redHex = String.valueOf(charHex[2]) + String.valueOf(charHex[3]);
            this.greenHex = String.valueOf(charHex[4]) + String.valueOf(charHex[5]);
            this.blueHex = String.valueOf(charHex[6]) + String.valueOf(charHex[7]);
            this.alphaHex = String.valueOf(charHex[0]) + String.valueOf(charHex[1]);
            noPrefixHex = noPrefixHex.substring(2);
        }
        this.red = Integer.parseInt(redHex, 16);
        this.green = Integer.parseInt(greenHex, 16);
        this.blue = Integer.parseInt(blueHex, 16);
        this.alpha = Integer.parseInt(alphaHex, 16);
        //set values
        this.valueHex = "#" + noPrefixHex;
        this.value = Integer.parseInt(noPrefixHex, 16);
    }

    public float getRed() {
        return red;
    }

    public float getGreen() {
        return green;
    }

    public float getBlue() {
        return blue;
    }

    public float getAlpha() {
        return alpha;
    }

    public int getValue() {
        return value;
    }

    public String getRedHex() {
        return redHex;
    }

    public String getGreenHex() {
        return greenHex;
    }

    public String getBlueHex() {
        return blueHex;
    }

    public String getAlphaHex() {
        return alphaHex;
    }

    public String getValueHex() {
        return valueHex;
    }

}