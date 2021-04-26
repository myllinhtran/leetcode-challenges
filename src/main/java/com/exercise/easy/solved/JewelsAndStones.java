package com.exercise.easy.solved;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAA";
        int out = new JewelsAndStones().numJewelsInStones(J, S);
        System.out.println(out);
    }

    private int numJewelsInStones(String jewels, String stones) {
        int numOfJewels = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(stones.substring(i, i + 1))) {
                numOfJewels++;
            }
        }
        return numOfJewels;
    }
}
