package com.exercise.easy.solved;

public class BusyStudent {

    // Driver method
    public static void main(String[] args) {
        int[] start = {9,8,7,6,5,4,3,2,1};
        int[] end = {10,10,10,10,10,10,10,10,10};
        int query = 5;
        int result = new BusyStudent().busyStudent(start, end, query);
        System.out.println(result);
    }

    private int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) count++;
        }
        return count;
    }
}
