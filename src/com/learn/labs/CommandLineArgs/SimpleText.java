package com.learn.labs.CommandLineArgs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by santoshdandey on 2/22/17.
 */
public class SimpleText {

    public static void main(String[] args) {

        Properties prop = new Properties();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("config.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            try {
                br = new BufferedReader(new FileReader("myconfig.properties"));
            } catch (FileNotFoundException e1) {
            }
        }
        try {
            prop.load(br);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String val1 = prop.getProperty("location");
        String val2 = prop.getProperty("zipcode");
        String val3 = prop.getProperty("firstName");
        String val4 = prop.getProperty("address");

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);

    }
}
