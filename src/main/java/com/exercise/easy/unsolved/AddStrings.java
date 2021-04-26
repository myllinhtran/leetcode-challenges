package com.exercise.easy.unsolved;

public class AddStrings {

    public static void main(String[] args) {
        String num1 = "128";
        String num2 = "32";
        String sum = new AddStrings().addString(num1, num2);
        System.out.println(sum);
    }

    private String addString(String num1, String num2) {
        int max = Math.max(num1.length(), num2.length());
        int min = Math.min(num1.length(), num2.length());
        int carry = 0;
        int j = min - 1;

        StringBuilder str = new StringBuilder();
        int sum = 0;
        for (int i = max - 1; i >= 0; i--) {
            final int num = Integer.parseInt(String.valueOf(num1.charAt(i)));
            if (j >= 0) {
                sum = num
                      + Integer.parseInt(String.valueOf(num2.charAt(j)))
                      + carry;
            }
            else {
                sum = num + carry;
            }
            if (sum % 10 == 0) {
                str.append(0);
                carry = 1;
            }
            else {
                str.append(sum);
                carry = 0;
            }
            j--;
        }
        return String.valueOf(str);
    }
}
