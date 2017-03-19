package com.learn.labs.ColletionsExample;

import java.util.ArrayList;

/**
 * Created by santoshdandey on 3/2/17.
 */
public class CollectionType {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<String>() ;

        list.add("bunnu");
        list.add("gundu");

        System.out.println("Elements Are " + list.size() + list);

        Employee employee = new Employee();
        list.add(employee.getFirstName());
        list.add(employee.getLastName());
        System.out.println(employee);

    }
}
