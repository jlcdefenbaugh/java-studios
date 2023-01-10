package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Characters_2 {

    public static void main(String[] args) {
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string to count its characters: ");
        String userString = input.nextLine();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] userStringArray = userString.toUpperCase().toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for(char letter : userStringArray){
            if (alphabet.indexOf(letter) >= 0) {
                if(counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
