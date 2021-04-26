package com.exercise.easy.solved;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = new KidsWithGreatestNumberOfCandies().kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    private List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        List<Boolean> kidsWithCandy = new ArrayList<>();
        for (int candy : candies) {
            kidsWithCandy.add(candy + extraCandies >= maxCandies);
        }
        return kidsWithCandy;
    }
}
