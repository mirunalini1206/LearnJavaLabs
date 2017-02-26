package com.learn.labs.StringJoiner;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

/**
 * Created by santoshdandey on 2/6/17.
 */
public class FormatinTryWithResource {

    public String doWrite(int eshan, int Aryan, int Santosh, double agediff) throws IOException {


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("myoutfile.txt", true))) {

            try (Formatter fr = new Formatter(bw)) {

                try {
                    int divideByzero = 1/0;
                }
                catch (ArithmeticException e) {
                    e.printStackTrace();
                    System.out.print(e.getMessage() + "\n");
                }

                fr.format(" My nephews age are %d, %d, %d", eshan, Aryan, Santosh);

                agediff = ( (Santosh - Aryan) + (Aryan  - eshan) / 3.0d);

                String result = String.format("My cousins agediff are %.1f Years", agediff);
                bw.write(result);


                //fr.format("The average age ", double avgdiff);
                return result;
            }

        }






    }

    public static void main(String[] args) {
        FormatinTryWithResource formatinTryWithResource = new FormatinTryWithResource();

        try {
            String result = formatinTryWithResource.doWrite(14,18, 20, 567);

            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

