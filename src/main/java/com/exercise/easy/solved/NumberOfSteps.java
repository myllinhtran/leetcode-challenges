package com.exercise.easy.solved;

public class NumberOfSteps {

    public static void main(String[] args) {
        int num = 14;
        int out = new NumberOfSteps().numberOfSteps(num);
        System.out.println(out);
    }

    private int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                steps++;
            }
            if (num % 2 == 1) {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }
}
