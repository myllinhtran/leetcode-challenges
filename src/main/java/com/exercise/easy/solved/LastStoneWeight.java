package com.exercise.easy.solved;

import java.util.*;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[] array = {2, 7, 4, 1, 8, 1};
        int result = new LastStoneWeight().lastStoneWeight(array);
        System.out.println(result);
    }

    private int lastStoneWeights(int[] stones) {
        if (stones.length == 1) return stones[0];

        List<Integer> arr = new ArrayList<>();
        for (int stone : stones) {
            arr.add(stone);
        }

        int len = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            Collections.sort(arr);
            arr.set(len - 1, arr.get(len - 1) - arr.get(len - 2));
            arr.set(len - 2, 0);
        }

        int found = 0;
        for (int num : arr) {
            if (num != 0) found = num;
        }
        return found;
    }

    private int lastStoneWeight (int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : stones) {
            queue.offer(num);
        }

        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if ( x != y) {
                queue.offer(x - y);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
