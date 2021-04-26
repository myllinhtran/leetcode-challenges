package com.exercise.easy.solved;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 6;
        int fib = fib(num);
        System.out.println(fib);
    }

    private static int fib(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }
}
