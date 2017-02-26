package com.learn.labs.StringJoiner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by santoshdandey on 2/7/17.
 */
public class OtherSplits {
    public static void main(String[] args) {

        String s1 = "kutti Dandey chittu Dandey Naanum Jesusum Cuties pattu";

        Pattern pattern = Pattern.compile("\\w+");

        Matcher matcher = pattern.matcher(s1);

while (matcher.find()){
    System.out.println(matcher.group());
}


    }
}
