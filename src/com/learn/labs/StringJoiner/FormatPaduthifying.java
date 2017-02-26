package com.learn.labs.StringJoiner;

/**
 * Created by santoshdandey on 1/25/17.
 */
public class FormatPaduthifying {
    public static void main(String[] args) {



    int rohit = 90, santosh = 60, eshan = 40, yosith = 25;

    double agediff = ((rohit - santosh) + (santosh - eshan) + (yosith  - eshan) / 4.0d);

    String result = String.format("My cousins agediff are %.1f Years", agediff);

    System.out.println(result);

}
}
