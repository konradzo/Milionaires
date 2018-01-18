package com.company;

/**
 * Created by slickender on 16.08.2017.
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

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = isTrue;
    }


}
