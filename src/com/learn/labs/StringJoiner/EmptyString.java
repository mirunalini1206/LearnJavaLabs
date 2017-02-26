package com.learn.labs.StringJoiner;

import sun.invoke.empty.Empty;

import java.util.StringJoiner;

/**
 * Created by santoshdandey on 1/19/17.
 */
public class EmptyString {

    public static void main(String[] args) {

        StringJoiner join = new StringJoiner("], [", "[", "]");

        join.setEmptyValue("EMPTY");
        //join.add(" ");

        System.out.println(join);

        //String theresult1 = join.toString();


    }

}
