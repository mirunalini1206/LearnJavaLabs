package com.learn.labs.ClassPath;

/**
 * Created by santoshdandey on 2/28/17.
 */
public class EnvironmentVariable {

    public static void main(String[] args) {

        String compName = System.getenv("PATH");

        String sysRoot = System.getenv("MYNAME");



        System.out.println(compName);
        System.out.println(sysRoot);
    }
}
