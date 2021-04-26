package com.exercise.edabit;

public class ReturnMiddleCharacter {

    public static void main(String[] args) {
        String word = "testing";
        String result = new ReturnMiddleCharacter().getMiddle(word);
        System.out.println(result);
    }

    private String getMiddle(String word) {
        int mid = word.length() / 2;
        int len = word.length();
        if (len % 2 == 0) return word.substring(mid-1, mid+1);
        else return word.substring(mid, mid+1);
    }
}
