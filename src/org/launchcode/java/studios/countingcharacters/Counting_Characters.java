package org.launchcode.java.studios.countingcharacters;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;

public class Counting_Characters {

    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of " +
                "the two terms has to be zero to start with. So if you move all the terms over to " +
                "one side, you can put the quadratics into a form that can be factored allowing " +
                "that sie of the equation to equal zero. Once you've done that, it's pretty " +
                "straightforward from there.";
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char letter: quote.toCharArray()) {
            if(countMap.containsKey(letter)) {
                int x = countMap.get(letter);
                countMap.put(letter, x + 1);
            } else {
                countMap.put(letter, 1);
            }
        }
        System.out.println(countMap);
    }




}
