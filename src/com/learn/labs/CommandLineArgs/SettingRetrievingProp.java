package com.learn.labs.CommandLineArgs;

import java.util.Properties;

/**
 * Created by santoshdandey on 2/15/17.
 */
public class SettingRetrievingProp {

    public static void main(String[] args) {

        Properties props = new Properties();

        props.setProperty("Display Name", "chittu");

        String result1 = props.getProperty("Display Name");

        String result2 =props.getProperty("AccNum");

        String result3 =props.getProperty("Position", "2");

        System.out.println(result3);

    }
}
