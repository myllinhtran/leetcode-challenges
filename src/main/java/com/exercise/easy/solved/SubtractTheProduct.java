package com.exercise.easy.solved;

public class SubtractTheProduct {

    public static void main(String[] args) {
        int n = 234;
        int out = new SubtractTheProduct().subtractProductAndSum(n);
        System.out.println(out);
    }

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n = n / 10;
        }
        return product - sum;
    }
}
