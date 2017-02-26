package com.learn.labs.CommandLineArgs;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by santoshdandey on 2/13/17.
 */
public class CommandLineFile {

    public static void main(String[] args) {

        if (args.length == 0) {

            System.out.println("Provide File Name");
            return;
        }

        String filename = args[0];


        if (Files.exists(Paths.get(filename))) {

            showfilelines(filename);

        } else
            System.out.println("File does not exist" + filename);


    }

    private static void showfilelines(String filename) {

        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
 }






