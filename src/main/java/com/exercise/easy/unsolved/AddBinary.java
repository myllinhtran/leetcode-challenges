package com.exercise.easy.unsolved;

public class AddBinary {

    public static void main(String[] args) {
        // Test case:
        // "0", "1"
        // "0", "0"
        // "11", "1"
        // "1010", "1001"

        String a = "1111";
        String b = "1111";
        String result = new AddBinary().addBinaries(a, b);
        System.out.println(result);
    }

    private String addBinaries(String a, String b) {

        // If the length of both strings are not equal,
        // pad 0 to the front of the shorter string
        if (a.length() > b.length()) {
            b = String.format("%1$" + a.length() + "s", b).replace(' ', '0');
        }
        if (a.length() < b.length()) {
            a = String.format("%1$" + b.length() + "s", a).replace(' ', '0');
        }

        if (a.length() == 1 && b.length() == 1) {
            if (a.charAt(0) == '1' && b.charAt(0) == '1') return "10";
            if (a.charAt(0) == '0' && b.charAt(0) == '0') return "0";
            else return "1";
        }

        char[] binarySum = new char[Math.max(a.length(), b.length()) + 1];
        int carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == b.charAt(i)) {
                if (a.charAt(i) == '1') {
                    binarySum[i + 1] = '0';
                    carry = 1;
                }
                else {
                    if (carry == 0) binarySum[i + 1] = '0';
                    else {
                        binarySum[i + 1] = '1';
                        carry = 1;
                    }

                }
            }
            else {
                if (carry == 0) binarySum[i + 1] = '1';
                else {
                    binarySum[i + 1] = '0';
                    carry = 1;
                }
            }
        }
        if (carry == 1) {
            binarySum[0] = '1';
        }

        return String.copyValueOf(binarySum);
    }
}
