package com.exercise.easy.unsolved;

public class TwoCityScheduling {

    public static void main(String[] args) {

        // {{10, 20}, {30, 200}, {400, 50}, {30, 20}}
        // [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]

        int[][] cost = new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        int result = new TwoCityScheduling().twoCitySchedCost(cost);
        System.out.println(result);
    }

    public int twoCitySchedCost(int[][] cost) {

        return 0;
    }
}
