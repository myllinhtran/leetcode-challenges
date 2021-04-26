package com.exercise.easy.solved;

public class Maximum69Number {

    public static void main(String[] args) {
        int num = 9999;
        int result = new Maximum69Number().maximum69Number(num);
        System.out.println(result);
    }

    private int maximum69Number(int num) {
        int len = String.valueOf(num).length() - 1;
        int max = 0;
        int count = 0;
        for (int i = len; i >= 0; i--) {
            int div = ( int ) Math.pow(10, i);
            int digit = num / div;
            num = num - (digit * div);
            if (digit == 6 && count < 1) {
                max = max + (9 * div);
                count++;
            }
            else {
                max = max + (digit * div);
            }
        }
        return max;
    }
}
