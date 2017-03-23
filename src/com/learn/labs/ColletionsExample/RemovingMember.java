package com.learn.labs.ColletionsExample;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by santoshdandey on 3/7/17.
 */
public class RemovingMember {

    public static void main(String[] args) {


        ArrayListClass v4 = new ArrayListClass("v4","40");
        ArrayListClass v2 = new ArrayListClass("v2", "xyz");
        ArrayListClass v3 = new ArrayListClass("v3", "40");
        ArrayListClass v5 = new ArrayListClass("v5", "40");
        ArrayList<ArrayListClass> list = new ArrayList<>();

        list.add(v4);
        list.add(v2);
        list.add(v3);
        list.add(v5);

        list.removeIf(Ohio -> Ohio.getValue().equals("40"));

        //System.out.println(list.toString());

        list.forEach(Ohio -> System.out.println(Ohio.getLabel()));



    }
}
