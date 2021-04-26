package com.exercise.easy.solved;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindromes(1221);
        System.out.println(result);
    }

    // My solution
    private boolean isPalindrome(int x) {
        if (x < 0) return false;

        List<Integer> digits = new ArrayList<>();
        for (; x != 0; x /= 10) {
            int digit = x % 10;
            digits.add(digit);
        }

        int j = digits.size() - 1;
        for (Integer digit : digits) {
            if (!digit.equals(digits.get(j))) {
                return false;
            }
            j--;
        }
        return true;
    }

    // Leetcode's solution
    private boolean isPalindromes(int x) {

        // Special cases:
        // If smaller than 0, return false
        // If last digit is 0 and x is not 0, return false
        if (x < 0 || x % 10 == 0 && x != 0) return false;


        // Invert the number until the middle
        // Stop invert when the original number is smaller than the inverted number
        // We know we already arrive at the middle
        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNum / 10
        return x == revertedNum || x == revertedNum / 10;
    }
}
