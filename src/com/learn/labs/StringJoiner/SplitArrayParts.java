package com.learn.labs.StringJoiner;

/**
 * Created by santoshdandey on 2/7/17.
 */
public class SplitArrayParts {

    public static void main(String[] args) {
        String s1 = "Eshan Dandey, Aryan Dandey, NishaSubramaniyan Cuties, KallakurichiDanush";
        String[] parts = s1.split("\\b");

        for (String TheParts : parts) {
            if (TheParts.matches("\\w+"))
            System.out.println(TheParts);
        }


    }
}
