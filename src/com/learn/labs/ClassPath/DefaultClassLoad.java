package com.learn.labs.ClassPath;

import com.sun.xml.internal.xsom.impl.WildcardImpl;
import org.joda.time.LocalDate;

/**
 * Created by santoshdandey on 2/27/17.
 */
public class DefaultClassLoad {

    public static void main(String[] args) {

        LocalDate newYear = new LocalDate().plusYears(1);
        System.out.println(newYear.toString());


    }
}
