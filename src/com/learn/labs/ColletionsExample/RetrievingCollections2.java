package com.learn.labs.ColletionsExample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by santoshdandey on 3/9/17.
 */
public class RetrievingCollections2 {

    public static void main(String[] args) {

        ArrayListClass[] arrayListClasses = {
                new ArrayListClass("v1", "50"),
                new ArrayListClass("v2", "60"),
                new ArrayListClass("v3", "choosy")
        };

        Collection<ArrayListClass> chittu =Arrays.asList(arrayListClasses);

        chittu.forEach(m -> System.out.println(m.getLabel()));
    }
}
