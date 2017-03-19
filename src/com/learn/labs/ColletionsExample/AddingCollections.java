package com.learn.labs.ColletionsExample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by santoshdandey on 3/2/17.
 */
public class AddingCollections {
    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();

        list1.add("Pattu");
        list1.add("kutty");

        LinkedList <String> list2 = new LinkedList<>();

        list2.add("Santo");
        list2.add("Chittu");

        list1.addAll(list2);

        System.out.println(list1);

        System.out.println(list2);
    }
}
