package com.learn.labs.ColletionsExample;

import java.util.ArrayList;

/**
 * Created by santoshdandey on 3/1/17.
 */
public class ExmpCollections {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("bob");
        strings.add("Chimmu");

        Employee employee = new Employee();
        employee.setFirstName("Santosh");
        employee.setLastName("Dandey");
        employee.setAge(31);
        employee.setSalary(1000.00);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);


        System.out.println("There are Elements " + employees.size());

        for (Object o : employees) {

            System.out.println(o.toString());
        }

        //String s = (String)employees.get(0);

    }
}
