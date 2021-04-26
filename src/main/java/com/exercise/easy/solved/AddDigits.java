package com.exercise.easy.solved;

public class AddDigits {

    public static void main(String[] args) {
        int num = 146;
        int result = new AddDigits().addDigits(num);
        System.out.println(result);
    }

    // Using recursion
    private int addDigits(int num) {
        int digit = num / 10;
        int remain = num % 10;
        int sumDigits = digit + remain;

        if (String.valueOf(num).length() == 1) {
            return num;
        }
        else {
            return new AddDigits().addDigits(sumDigits);
        }
    }

    // Using digital root method
    private int addDigit(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}
