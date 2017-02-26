package com.learn.labs.StringJoiner;

/**
 * Created by santoshdandey on 2/7/17.
 */
public class SplitpartEnExample {

    public static void main(String[] args) {

        String s1 = "kutti Dandey chittu Dandey Naanum Jesusum Cuties pattu";

        String[] parts = s1.split("\\b");

        for (String TheParts:parts){

            if(TheParts.matches("\\w+"))
                System.out.println(TheParts);
        }
    }
}
