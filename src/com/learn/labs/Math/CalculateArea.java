package com.learn.labs.Math;

/**
 * Created by santoshdandey on 1/25/17.
 */
public class CalculateArea {

    public double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double areaofSquare(double side) {
        return Math.pow(side,2);
    }

    public double areaOfCube(double side){
        return Math.pow(side, 3);
    }

    public double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }
}
