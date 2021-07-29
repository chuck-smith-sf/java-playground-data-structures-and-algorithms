package com.chucksmith;

import javax.management.openmbean.ArrayType;
import java.lang.reflect.Array;
import java.util.*;

class User {

}

public class Application {

    public static void main(String[] args) {

//******************* Lambdas *************************

        List<String> words = new ArrayList<>(Arrays.asList("The", "two", "biggest", "problems", "In", "computer", "science"));
        List<String> fileNames = new ArrayList<>(Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"));
        String[] array1 = new String[]{"The", "two", "biggest", "problems", "In", "computer", "science"};
        List<String> arrayList1 = new ArrayList<>(Arrays.asList(array1));
        Integer[] array2 = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        Map<String, Integer> newMap1 = new LinkedHashMap<>();
        for (int i = 0; i < array1.length; i++) {
            newMap1.put(array1[i], array2[i]);
        }

        Map<String, Integer> newMap2 = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            newMap2.put(array1[i], array2[i]);
        }
        System.out.println("this is an array");
        System.out.println(array1);

        System.out.println(newMap1);
        System.out.println(newMap2);

        newMap1.putIfAbsent("chuck", 10);
        System.out.println(newMap1);
        newMap1.replace("chuck", 11);
        System.out.println(newMap1);
        System.out.println(newMap1.containsKey("chuck"));
        System.out.println(newMap1.values());
        System.out.println(newMap1.keySet());


//        for (String i :
//                arrayList1) {
//            //System.out.println(i);
//        }
//        System.out.println(arrayList1.hashCode());
//        System.out.println(words.hashCode());
//        System.out.println(words.equals(arrayList1));
//        System.out.println(words.iterator());
//        System.out.println(arrayList1);
//        arrayList1.removeIf(word -> (word.length() < 4));
//        System.out.println(arrayList1);

//        fileNames.forEach(file -> System.out.println(file.replace(" ", "-")));
//
//        for (String word:
//             words) {
//            System.out.println(word.toUpperCase());
//        }

        // lambda: three parts: 1(parameter list "word"), 2(arrow token "->"), 3(Body that gets executed(sout...)
//        words.forEach(word -> System.out.println(word.toUpperCase()));

        //expended - performs the same as above
        //multiple parameters or statements require curly braces
//        words.forEach(word -> {
//            System.out.println(word.toUpperCase());
//        });

        //example multiple parameters
        words.sort((a, b) -> a.compareTo(b));
        // redo above with reference method (Method reference)
        words.sort(String::compareTo);

        //example multiple statements in curly braces
//        words.removeIf(word -> {
//            String firstLetter = word.substring(0, 1);
//            String rest = word.substring(1);
//            return firstLetter.matches("[A-Z]") && rest.matches("^[a-z]+$");
//        });
//
//        System.out.println(words);



//************ choosing the right data structure ******

//        XMLElement element1 = new XMLElement();
//        element1.addAttribute("id", "element");
//
//        XMLElement element2 = new XMLElement();
//        element2.addAttribute("name", "e2");
//
//        element1.addChild(element2);
//
//        System.out.println(element1);

//*************** boxing/unboxing **********************
//wrapper classes
//        int x = 4;
//        // calls y.intValue();
//        Integer y = 7;
//
//        System.out.println(x+y);
//        ArrayList<Integer> number = new ArrayList<Integer>();
//        // calls Integer.valueOf(1);
//        number.add(1);
//        number.add(2);
//        ArrayList<User> users = new ArrayList<User>();


//************** The Accumulator Pattern *****************
//
//        Accumulator acc = new Accumulator();
//        List<Integer> input = Arrays.asList(1,2,3,4,5);
//        System.out.println(acc.sum(input));
//        System.out.println(acc.shortWords("the,green,jungle,is,excellent", 6));
//        String[] input2 = new String[]{"Alice"};
//        System.out.println(acc.toSentence(input2));
        //see problem1.txt for explanation of how to create the methods.


// ************** HashMaps ********************************
//        HashMap<String, Integer> birthYears = new HashMap<>();
//        birthYears.put("angelica", 1756);
//        birthYears.put("alexander", 1757);
//        birthYears.put("eliza", 1799);
//        System.out.println(birthYears);
//        System.out.println(birthYears.get("alexander"));
//        System.out.println(birthYears.containsKey("aaron"));
//
//        birthYears.forEach((key, value) -> {
//            System.out.println(key);
//            System.out.println(key + value);
//        });
//
//        HashMap<Integer, String> values = new HashMap<>();
//        values.put(747, "airplane");
//        values.put(10, "Laphroaig");
//        System.out.println(values.containsKey(747));

// ************** Arrays and Lists ************************
        //Arrays and Lists
//        String[] names = new String[2];
//        names[0] = "robert";
//        names[1] = "bob";
//        System.out.println(names[1]);
//
//        for(String name: names){
//            System.out.println(name);
//        }
//
//        //doesn't print nice and you can't call methods on arrays
//        System.out.println(names);
//        Arrays.sort(names);
//        System.out.println("sorted array");
//        for(String name : names){
//            System.out.println(name);
//        }
//
//        //ArrayList rock! you have to import ArrayList.. functions are available such as add and get
//        //it prints nice too
//        ArrayList<String> nameList = new ArrayList<>();
//        nameList.add("john");
//        nameList.add("Sam");
//
//        System.out.println(nameList.get(0));
//        for (String name : nameList){
//            System.out.println(name);
//        }
//
//        nameList.forEach(System.out::println);
//        System.out.println(nameList.indexOf("Sam"));
//        //you can also use sort and remove
//
//        System.out.println(nameList);
//
//        // Implement the sortArray method below below
//        String[] firstName = new String[]{"chuck", "bob", "sam", "buddy"};
//
//        ArrayList<String> sortedArrayList = new ArrayList<>();
//        Arrays.sort(firstName);
//        for (String name : firstName) {
//            sortedArrayList.add(name);
//        }
//        System.out.println(sortedArrayList);

    }
}
