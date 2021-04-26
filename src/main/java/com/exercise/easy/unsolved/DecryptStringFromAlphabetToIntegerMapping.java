package com.exercise.easy.unsolved;


public class DecryptStringFromAlphabetToIntegerMapping {

    public static void main(String[] args) {
        String s = "25#";
        String fre = new DecryptStringFromAlphabetToIntegerMapping().freAlphabets(s);
        System.out.println(fre);
    }

    // String[] jToZ = {"10#", "12#", "13#", "14#", "15#", "16#", "17#", "18#", "19#", "20#", "21#", "22#", "23#", "24#", "25#", "26#"};


    private String freAlphabets(String s) {
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        StringBuilder origin = new StringBuilder(s);
        StringBuilder decrypt = new StringBuilder();

        for (int i = 0; i <= origin.length() + 2; i++) {
            if (origin.length() >= 3) {
                String combo = origin.substring(0, 3);
                if (combo.contains("#")) {
                    int index = Integer.parseInt(origin.substring(0, 2));
                    Character letter = alphabet[index - 1];
                    decrypt.append(letter);
                    origin.delete(0, 3);
                }
                else {
                    int index = Integer.parseInt(origin.substring(0, 1));
                    Character letter = alphabet[index - 1];
                    decrypt.append(letter);
                    origin.delete(0, 1);
                }
            }
            else {
                int index = Integer.parseInt(origin.substring(0, 1));
                Character letter = alphabet[index - 1];
                decrypt.append(letter);
                origin.delete(0, 1);
            }
        }
        return String.valueOf(decrypt);
    }
}
