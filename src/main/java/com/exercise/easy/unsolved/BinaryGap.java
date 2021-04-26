package com.exercise.easy.unsolved;

public class BinaryGap {

    public static void main(String[] args) {
        int decimal = 22;
        int result = new BinaryGap().binaryGap(decimal);
        System.out.println(result);
    }

    private int binaryGap(int N) {
        int count = 0;
        int distance = 0;

        while (N > 0) {
            int remainder = N % 2;
            if (remainder == 1) {
                if (count != 0) {
                    if (distance < count) {
                        distance = count;
                    }
                    count = 0;
                    N *= 2;
                } else {
                    count++;
                }
            }
            if (remainder == 0) {
                if (count != 0) {
                    count++;
                }
            }
            N /= 2;
        }
        return distance;
    }

    private int binaryGaps(int N) {
        String binary = convertDecimalToBinary(N);
        System.out.println(binary);

        int count = 0;
        int distance = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && count != 0) {
                if (distance < count) {
                    distance = count;
                }
                count = 0;
                i = i - 1;
            }
            else {
                count++;
            }
        }
        return distance;
    }

    private static String convertDecimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            decimal = decimal / 2;
            binary.insert(0, remainder);
        }
        return String.valueOf(binary);
    }
}
