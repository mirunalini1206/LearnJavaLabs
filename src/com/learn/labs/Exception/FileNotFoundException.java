package com.learn.labs.Exception;


import java.io.*;
import java.util.Scanner;


/**
 * Created by santoshdandey on 1/17/17.
 */

class NoName {

    public static void main(String[] args) throws IOException, FileNotFoundException {

    BufferedReader br = new BufferedReader (new FileReader("Users/santoshdandey/Documents/shakespeare_macbeth_play.txt"));

    File file = new File("Users/santoshdandey/Documents/shakespeare_macbeth_play.txt");

    String line = "";

    while(line != null) {

        try {
            String[] parts = line.split(" ");
            for (String w : parts) {


                return ;
        }
        line = br.readLine();}

        catch (FileNotFoundException e1) {

            e1.printStackTrace();
        }
        catch (IOException e2) {

            e2.printStackTrace();
        }

    }

    }

}