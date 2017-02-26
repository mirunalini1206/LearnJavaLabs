package com.learn.labs.Exception;

import java.io.*;

/**
 * Created by santoshdandey on 1/17/17.
 */
public class NoNamee {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        try {

            BufferedReader br = new BufferedReader(new FileReader("/Users/santoshdandey/Documents/data/shakespeare_macbeth_play.txt"));

            File file = new File("/Users/santoshdandey/Documents/data/shakespeare_macbeth_play.txt");
            if(file.exists()) {
                System.out.println("File exists");
                System.out.println("File Path:" + file.getAbsolutePath());
                System.out.println("canRead:" + file.canRead());
                System.out.println("canWrite:" + file.canWrite());

            }
            else {
                System.out.println("File doesn't exist try with Back slash");
                file = new File("/Users/santoshdandey/Documents/data/shakespeare_macbeth_play.txt");
                if(file.exists()) {
                    System.out.println("File exists");
                }

            }

            String line = "";

            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    return;
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
            System.out.println("Catched the exception here");
            BufferedReader br = new BufferedReader(new FileReader("/Users/santoshdandey/Documents/data/shakespeare_macbeth_play.txt"));
            File file = new File("Users/santoshdandey/Documents/data/shakespeare_macbeth_play.txt");


        } catch (IOException e2) {
            e2.printStackTrace();
        }

    }
}

