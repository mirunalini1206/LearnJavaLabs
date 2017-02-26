package com.learn.labs.StringJoiner;

/**
 * Created by santoshdandey on 2/7/17.
 */
public class ReplaceAll {

    public static void main(String[] args) {

        String s1 = "Eshan Dandey, Aryan Dandey, NishaSubramaniyan Cuties, KallakurichiDanush";

        String s2 = s1.replaceAll("\\bDan", "santosh");

        System.out.println(s2);


    }

}
