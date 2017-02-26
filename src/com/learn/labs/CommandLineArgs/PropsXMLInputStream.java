package com.learn.labs.CommandLineArgs;

import java.io.*;
import java.util.Properties;

/**
 * Created by santoshdandey on 2/22/17.
 */
public class PropsXMLInputStream {

    public static void main(String[] args) throws IOException{

        Properties props = new Properties();

        props.setProperty("Santosh", "Name");

        props.setProperty("AccountNum", "889.770.654");

        try(DataInputStream stream = new DataInputStream(new FileInputStream("chittu.xml"))) {

            props.loadFromXML(stream);

            String Name = props.getProperty("location");


        }
    }
}
