package com.learn.labs.CommandLineArgs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

/**
 * Created by santoshdandey on 2/21/17.
 */
public class PropertyText {

    public static void main(String[] args) throws IOException{

        Properties props = new Properties();

        props.setProperty("Santosh", "Name");

        props.setProperty("AccountNum", "889.770.654");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("myoutfile.txt"))){

            props.store(bw, "My Comments");

        }
    }
}
