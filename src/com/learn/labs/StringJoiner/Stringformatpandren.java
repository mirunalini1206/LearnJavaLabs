package com.learn.labs.StringJoiner;

/**
 * Created by santoshdandey on 1/25/17.
 */
public class Stringformatpandren {


    public static void main(String[] args) {
        int rohit = 9, santosh = 60, eshan = 40, yosith = 25;


        String result = String.format("My cousins ages are %d, %d, %d and %d", rohit, santosh, eshan, yosith);

        System.out.println("Hello" + result);
    }
}
