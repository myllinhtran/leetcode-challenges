package com.exercise.codewar;


public class DubStep {

    public static void main(String[] args) {
        String song = "WUBWUBHELLOWUBWUBWORLDWUB";
        String original = songDecode(song);
        System.out.println(original);
    }

    private static String songDecoder(String song) {
        String[] splittedSong = song.split("WUB");
        String originalSong = "";
        for (String word : splittedSong) {
            if (!word.equals("")) {
                originalSong += word + " ";
            }
        }
        return originalSong.trim();
    }

    private static String songDecode(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}
