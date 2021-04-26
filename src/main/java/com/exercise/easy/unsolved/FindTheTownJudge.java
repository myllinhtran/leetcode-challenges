package com.exercise.easy.unsolved;

import java.util.HashMap;
import java.util.Map;

public class FindTheTownJudge {

    public static void main(String[] args) {
        // {1, 2}
        // {1, 3}, {2, 3}, {3, 1}
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int N = 4;
        int result = new FindTheTownJudge().findJudge(N, trust);
        System.out.println(result);
    }

    public int findJudge(int N, int[][] trust) {
        int judge = 0;



        if (judge == 0) return -1;
        else return judge;
    }
}
