package com.exercise.easy.unsolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        System.out.println("Paths: " + paths);

        String destCity = new DestinationCity().destCity(paths);
        System.out.println(destCity);
    }

    private String destCity(List<List<String>> paths) {


        return "";
    }
}
