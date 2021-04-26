package com.exercise.easy.solved;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        // Test cases -- Value returned:
        // {} -- ""
        // {""} -- ""
        // {"flore", "flor", "fly"} -- "fl"
        // {"abb", "abc"} -- "ab"
        // {"ab", "", "c"} -- ""
        // {"aa", "aa"} -- "aa"
        // {"aca","cba"} -- ""

        String[] strings = {"aca", "cba"};
        String result = new LongestCommonPrefix().longestCommonPrefix(strings);
        System.out.println(result);
    }

    private String longestCommonPrefix(String[] strings) {

        // Special cases:
        // If the strings array is empty, return an empty string
        // If the strings array has one element, return that element
        if (strings.length == 0) return "";
        if (strings.length == 1) return strings[0];

        // Find out the shortest string in the array
        int min = strings[0].length();
        for (String str : strings) {
            min = Math.min(min, str.length());
        }

        // Iterate through every character of the first string
        // Iterate through every string of the array
        // If the first character of the first string of the array is not common, return empty string
        // If not, append the letter to the prefix to be returned

        StringBuffer prefix = new StringBuffer();

        for (int i = 0; i < min; i++) {
            String letter = String.valueOf(strings[0].charAt(i));
            for (String str : strings) {
                if (!letter.equals(String.valueOf(str.charAt(i)))) {
                    letter = "";
                    break;
                }
            }
            if (i == 0 && letter.equals("")) return "";
            else {
                prefix.append(letter);
            }
        }
        return String.valueOf(prefix);
    }
}
