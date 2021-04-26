package com.exercise.easy.unsolved;

import java.sql.Struct;

public class MaximumNumberOfBalloon {

    public static void main(String[] args) {
        String text = "nlaebolko";
        int result = new MaximumNumberOfBalloon().maxNumberOfBalloons(text);
        System.out.println(result);
    }

    private int maxNumberOfBalloons(String text) {
        String b = "balloon";
        StringBuilder txt = new StringBuilder(text);

        int count = 0;
        int size = b.length();


        return count;
    }
}
