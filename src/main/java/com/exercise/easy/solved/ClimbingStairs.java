package com.exercise.easy.solved;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        int result = new ClimbingStairs().climbStair(n);
        System.out.println(result);
    }

    /*
        The person can reach n stairs from either (n-1)^th stairs or (n-2)^th stairs
        So in order to reach n^th stairs, way(n) = way(n-1) + way(n-2)
        This is actually fibonacci numbers, solve using recursion
        Time complexity: O(n^2)
        Auxiliary space: O(1)
     */
    private int climbStair(int stairs) {
        if (stairs == 0 || stairs == 1) return 1;
        else return climbStair(stairs - 1) + climbStair(stairs - 2);
    }


    /*
        Solving fibonacci numbers using Dynamic Programming
        Time complexity: O(n)
        Memory usage 38.2MB
     */
    private int climbStairs(int n) {
        // Declare an array to store the fibonacci numbers
        int[] fib = new int[n + 2];

        // 0th and 1st members of the series must be 1
        fib[0] = 0;
        fib[1] = 1;

        // Add the previous 2 numbers in the series and store it
        for (int i = 2; i <= n + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n + 1];
    }
}
