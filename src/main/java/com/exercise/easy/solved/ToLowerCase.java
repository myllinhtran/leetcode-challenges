package com.exercise.easy.solved;

public class ToLowerCase {

    public static void main(String[] args) {
        String s = "Hello";
        String result = new ToLowerCase().toLowerCase(s);
        System.out.println(result);
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
