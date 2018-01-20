package com.company;

/**
 * Created by slickender on 20.01.2018.
 */
public class Question {

    private  String text;
    private boolean isTrue;

    public Question(String text, boolean isTrue) {
        this.text = text;
        this.isTrue = isTrue;
    }

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTrue(boolean aTrue) {
        isTrue = isTrue;
    }

    public boolean isTrue() {
        return isTrue;
    }


}
