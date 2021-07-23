package com.chucksmith;

import java.util.ArrayList;
import java.util.List;

public class Accumulator {

    int sum(List<Integer> input) {
        int result = 0;

        for (int number : input) {
            result += number;
        }
        return result;
    }

    List<String> shortWords(String input, int maxLength) {
        ArrayList<String> result = new ArrayList<>();

        String[] words = input.split(",");
        for (String word : words
        ) {
            if (word.length() < maxLength) {
                result.add(word);
            }
        }

        return result;
    }

    String toSentence(String[] input) {
        String result = "";
       int lastWord = input.length - 1;
//        if (input.length == 1)  result = input[0];
//        else if (input.length == 2) result = input[0] + " and " + input[1];
//        else {
        for (int i = 0; i < input.length; i++) {
            if (i == 0) result += input[i];
            else if (i == lastWord) result += " and " + input[i];
            else result += ", " + input[i];
        }
        //}
        return result;
    }
}
