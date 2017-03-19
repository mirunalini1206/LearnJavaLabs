package com.learn.labs.staticexample;

/**
 * Created by santoshdandey on 3/19/17.
 */
public class StaticLab {

    private static int increment = 1;
    private  int decrement = 1;


    public int getIncrement(){
        return increment++;
    }

    public int getDecrement(){
        return  decrement--;
    }

    public static void main(String[] args) {
        StaticLab staticLab = new StaticLab();
        System.out.println("Increment Value:" +staticLab.getIncrement() + " and decrementValue is " + staticLab.getDecrement());
        StaticLab staticLab1 = new StaticLab();
        System.out.println("Increment Value:" +staticLab1.getIncrement() + " and decrementValue is " + staticLab1.getDecrement());
        StaticLab staticLab2 = new StaticLab();
        System.out.println("Increment Value:" +staticLab2.getIncrement() + " and decrementValue is " + staticLab2.getDecrement());

    }
}
