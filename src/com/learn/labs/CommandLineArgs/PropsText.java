package com.learn.labs.CommandLineArgs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by santoshdandey on 2/22/17.
 */
public class PropsText {

    public static void main(String[] args) throws IOException {

        Properties props = new Properties();

        props.setProperty("Name", "Miru");

        props.setProperty("Occu", " Home");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Prop.properties"))){

            props.store(bw, "My Comments");

        }
    }
}
