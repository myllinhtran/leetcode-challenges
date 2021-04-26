package com.exercise.easy.solved;

public class ImplementStrStr {

    public static void main(String[] args) {
        // hello -- ll -- 2
        // aaa -- a -- 0
        // mississippi -- pi -- 9

        String haystack = "mississippi";
        String needle = "pi";
        int result = new ImplementStrStr().strStr(haystack, needle);
        System.out.println(result);
    }

    private int strStr(String haystack, String needle) {

        // If needle is an empty string
        if (needle.isEmpty()) return 0;

        // If the needle is not within the haystack
        if (!haystack.contains(needle)) return -1;

        int index = 0;
        int len = needle.length();
        for (int i = 0; i <= haystack.length() - len; i++) {
            if (haystack.substring(i, i + len).equals(needle)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
