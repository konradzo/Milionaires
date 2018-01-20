package com.company;

/**
 * Created by slickender on 16.08.2017.
 */
public class User {

    private int numberOfPoints;

    public User(){}

    public User(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
    public void addPoint(){
        this.numberOfPoints++;
    }
}
