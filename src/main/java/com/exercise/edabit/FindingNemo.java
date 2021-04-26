package com.exercise.edabit;


public class FindingNemo {

    public static void main(String[] args) {
        String sentence = "I am finding Nemo !";
        String result = new FindingNemo().findNemo(sentence);
        System.out.println(result);
    }

    private String findNemo(String sentence) {
        String[] splitStr = sentence.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].equals("Nemo")) {
                return "I found Nemo at " + (i + 1) + "!";
            }
        }
        return "I can't find Nemo :(";
    }
}
