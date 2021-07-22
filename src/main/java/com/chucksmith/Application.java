package com.chucksmith;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {


// ************** Arrays and Lists ************************
        //Arrays and Lists
        String[] names = new String[2];
        names[0] = "robert";
        names[1] = "bob";
        System.out.println(names[1]);

        for(String name: names){
            System.out.println(name);
        }

        //doesn't print nice and you can't call methods on arrays
        System.out.println(names);
        Arrays.sort(names);
        System.out.println("sorted array");
        for(String name : names){
            System.out.println(name);
        }

        //ArrayList rock! you have to import ArrayList.. functions are available such as add and get
        //it prints nice too
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("john");
        nameList.add("Sam");

        System.out.println(nameList.get(0));
        for (String name : nameList){
            System.out.println(name);
        }

        nameList.forEach(System.out::println);
        System.out.println(nameList.indexOf("Sam"));
        //you can also use sort and remove

        System.out.println(nameList);

        // Implement the sortArray method below below
        String[] firstName = new String[]{"chuck", "bob", "sam", "buddy"};

        ArrayList<String> sortedArrayList = new ArrayList<>();
        Arrays.sort(firstName);
        for (String name : firstName) {
            sortedArrayList.add(name);
        }
        System.out.println(sortedArrayList);

    }
}