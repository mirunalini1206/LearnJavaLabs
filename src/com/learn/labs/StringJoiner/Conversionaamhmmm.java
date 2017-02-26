package com.learn.labs.StringJoiner;

/**
 * Created by santoshdandey on 1/26/17.
 */
public class Conversionaamhmmm {

    public static void main(String[] args) {

        int i = 65;

        String s1 = String.format(" I Value is %d", i);
        String s2 = String.format(" I Value is %#x", i);
        String s3 = String.format(" I Value is %#o", i);
        System.out.println(s2);
    }

}
