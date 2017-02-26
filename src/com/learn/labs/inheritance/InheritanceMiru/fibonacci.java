package com.learn.labs.inheritance.InheritanceMiru;

import java.util.Dictionary;

/**
 * Created by santoshdandey on 1/10/17.
 */
public class fibonacci extends MathLog {

    public int fibonacci(int x) {

        if ( x == 0){
            return 0;
        }
    else if (  x == 1){
            return 1;
        }

    else
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}