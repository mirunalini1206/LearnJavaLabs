package com.learn.labs.StringJoiner;

/**
 * Created by santoshdandey on 1/26/17.
 */
public class FormatFlagsAam {

    public static void main(String[] args) {
//int W = 450987.67, S = 678;
        //System.out.println(String.format("W:%d, S:%d", 45, 678));

        //System.out.println(String.format("W:%4d, S:%4d", 45, 678));

        //System.out.println(String.format("W:%04d, S:%04d", 45, 678));

        //System.out.println(String.format("W:%-4d, S:%-4d", 45, 678));

        //System.out.println(String.format("W: %,d", 450987));

        System.out.println(String.format("W: %, .2f", 450987.9876543));


    }
}
