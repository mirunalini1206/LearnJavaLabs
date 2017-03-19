package com.learn.labs.ColletionsExample;

import java.util.ArrayList;

/**
 * Created by santoshdandey on 3/8/17.
 */
public class RetreivingAnArray {

    public static void main(String[] args) {

        ArrayList<ArrayListClass> list = new ArrayList<>();

        list.add(new ArrayListClass("v1", "abc"));

        list.add(new ArrayListClass("v2", "uio"));

        list.add(new ArrayListClass("v3", "abc"));

        Object[] objectsarray =list.toArray();

        ArrayListClass[] a1 = list.toArray(new ArrayListClass[0]);
        ArrayListClass[] a2 = new ArrayListClass[3];

        ArrayListClass[] a3 = list.toArray(a2);

        if(a2 == a3) System.out.println("a1 & a2are referencing the same array");

        //System.out.println(a1);
        //System.out.println(a3);
    }
}
