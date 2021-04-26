package com.exercise.edabit;

public class LettersOnly {

    public static void main(String[] args) {
        String str = "R!=:~0o0./c&}9k`60=y";
        String result = new LettersOnly().theLetterOnly(str);
        System.out.println(result);
    }

    private String lettersOnly(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetUpper = alphabet.toUpperCase();

        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (alphabet.contains(str.substring(i, i + 1)) ||
                alphabetUpper.contains(str.substring(i, i + 1))
            ) {
                newStr.append(str.charAt(i));
            }
        }
        return String.valueOf(newStr);
    }

    private String theLetterOnly(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    private String letterOnly(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }
}
