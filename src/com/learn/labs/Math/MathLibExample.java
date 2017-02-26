package com.learn.labs.Math;

/**
 * Created by santoshdandey on 1/25/17.
 */
public class MathLibExample {

    public static void main(String[] args) {

        CalculateArea calculateArea = new CalculateArea();
        System.out.println("The area for the circle is:" + calculateArea.areaOfCircle(5));
        System.out.println("The ara of cube for 8 is " + calculateArea.areaOfCube(8));
        System.out.println("The area of square for 8 is " + calculateArea.areaofSquare(8));
        System.out.println("The perimeter of circle for 8 is " + calculateArea.perimeterOfCircle(8));

    }



}
