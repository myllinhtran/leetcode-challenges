package com.exercise.edabit;

public class IsTheStringInOrder {

    public static void main(String[] args) {
        String str = "124";
        boolean isInOrder = new IsTheStringInOrder().isInOrder(str);
        System.out.println(isInOrder);
    }

    private boolean isInOrder(String str) {
        char[] letters = str.toCharArray();
        int i = 0;
        for (int j = 1; j < letters.length; j++) {
            if (letters[i] > letters[j]) return false;
            i++;
        }
        return true;
    }
}
