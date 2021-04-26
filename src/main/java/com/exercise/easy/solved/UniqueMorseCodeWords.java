package com.exercise.easy.solved;

import java.util.ArrayList;
import java.util.List;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = new UniqueMorseCodeWords().uniqueMorseRepresentations(words);
        System.out.println(result);
    }

    private int uniqueMorseRepresentations(String[] words) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        List<String> concatWords = new ArrayList<>();

        for (String word : words) {
            String concat = "";
            for (Character c : word.toCharArray()) {
                int index = alphabet.indexOf(c);
                concat += morseCodes[index];
            }
            if (!concatWords.contains(concat)) {
                concatWords.add(concat);
            }
        }
        return concatWords.size();
    }
}
