package com.exercise.easy.solved;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int reversed = reverseInteger.reverse(1534236469);
        System.out.println(reversed);
    }

    private int reverse(int number) {
        long reversed = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        if (reversed > Integer.MAX_VALUE) {
            return 0;
        }
        if (reversed < Integer.MIN_VALUE) return 0;

        return Integer.parseInt(reversed + "");
    }
}
