package com.chucksmith;

import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void arrayTests() {
        // an array a collection of data. Arrays are not used often
        // You cannot modify the length of an array at runtime.
        // they don't have a push or slice method
        String[] words = new String[10];
        words[0] = "Things";

        String[] initialWords = {
                "chuck",
                "smith",
                "hello"
        };

        String[] setLater;
        setLater = new String[7];
        setLater = new String[332];

        assertEquals(3, initialWords.length);
        assertEquals(332, setLater.length);
    }

    @Test
    public void listTest() {
        //a list is like an array but you can add and remove from it.
        //Left side should be generic "List" (on left side), right side more specific "ArrayList".
        List<String> words = new ArrayList<>();
        List<String> wordsUsingArrayAsList = new ArrayList<>(Arrays.asList("bob", "suzy", "jim", "robert"));
        words.add("chuck");
        words.add("smith");
        words.add("jumanji");
        assertEquals(3, words.size());
        words.remove(words.get(0));
        System.out.println(words);
        assertEquals(2, words.size());
        assertEquals("smith", words.get(0));
        System.out.println(wordsUsingArrayAsList.getClass().getSimpleName());
    }

    @Test
    public void mapTest() {
        // start generic on the left side "Map" and get more specific on the right side "HashMap".
        Map<String, Boolean> map1 = new HashMap<>();
        map1.put("thing1", true);
        map1.put("thing2", true);
        map1.put("thing3", false);

        System.out.println(map1);
        assertFalse(map1.containsKey("thing5"));
        System.out.println(map1.keySet());
        //Set<String>  mapOfKeys = new map1.keySet();
        assertEquals(false, map1.get("thing3"));

    }

    @Test
    public void abstractTests() {
        Silverware myThing = new Fork();
        List<Silverware> drawer = new ArrayList<>(Arrays.asList(new Spoon(), new Fork()));

        System.out.println(drawer.get(0).isClean());
        // as cast is required so you can access the super ScoopMethod because the drawer was implemented as type
        // Silverware.
        ((Spoon) drawer.get(0)).supperScoop();
        drawer.get(1).use(3);
    }


}
