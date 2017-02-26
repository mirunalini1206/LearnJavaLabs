package com.learn.labs.CommandLineArgs;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Created by santoshdandey on 2/22/17.
 */
public class PropsXMLOuputStream {
    public static void main(String[] args) throws IOException {

        Properties Props = new Properties();

        Props.setProperty("Name", "Miru");
        Props.setProperty("AccountNum", "33355567");

        try(DataOutputStream stream = new DataOutputStream(new FileOutputStream("chittu.xml"))){

            Props.storeToXML(stream, "My Comments");
        }

    }

}
