package com.learn.labs.inheritance;

/**
 * Created by santoshdandey on 1/9/17.
 */
public class Calculator extends Division {


    public double log(double number){
        return Math.log(number);
    }

    public int fibonnaci(Integer value) {

        Integer result = 1;
        for (int i=value;i>0;i--){
            result *= i;
        }

        return result;
    }
}
