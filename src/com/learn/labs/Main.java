package com.learn.labs;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        StringJoiner stringjoin = new StringJoiner("], [", " { [", "] }");

        stringjoin.add("Eshan").add("Aryan").add("Dandey");

        System.out.println(stringjoin);

    }
}
