package com.exercise.easy.solved;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FinalPricesWithSpecialDiscountInAShop {

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] finalPrices = finalPrices(prices);
        System.out.println(Arrays.toString(finalPrices));
    }

    private static int[] finalPrice(int[] prices) {
        int[] finalPrices = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    finalPrices[i] = prices[i] - prices[j];
                    break;
                }
                if (j == prices.length - 1 && finalPrices[i] == 0) {
                    finalPrices[i] = prices[i];
                    break;
                }
            }
        }
        if (finalPrices[prices.length - 1] == 0) finalPrices[prices.length - 1] = prices[prices.length - 1];
        return finalPrices;
    }

    private static int[] finalPrices(int[] p) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < p.length; i++) {
            while (!stack.isEmpty() && p[i] <= p[stack.peek()])
                p[stack.pop()] -= p[i];
            stack.push(i);
        }
        return p;
    }
}
