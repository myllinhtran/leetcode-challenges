package com.exercise.easy.solved;

public class RobotReturnToOrigin {

    public static void main(String[] args) {
        String moves = "LDRRLRUULR";
        boolean result = new RobotReturnToOrigin().judgeCircle(moves);
        System.out.println(result);
    }

    private boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') horizontal++;
            if (moves.charAt(i) == 'L') horizontal--;
            if (moves.charAt(i) == 'U') vertical++;
            if (moves.charAt(i) == 'D') vertical--;
        }
        return horizontal == 0 && vertical == 0;
    }
}
