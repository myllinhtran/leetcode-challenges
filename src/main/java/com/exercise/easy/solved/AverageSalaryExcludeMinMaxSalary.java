package com.exercise.easy.solved;

public class AverageSalaryExcludeMinMaxSalary {

    // Driver method
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        double average = new AverageSalaryExcludeMinMaxSalary().average(salary);
        System.out.println(average);
    }

    private double average(int[] salary) {
        int minSalary = salary[0];
        int maxSalary = salary[0];
        double sum = salary[0];

        for (int i = 1; i < salary.length; i++) {
            int currentSalary = salary[i];
            if (minSalary > currentSalary) minSalary = currentSalary;
            if (maxSalary < currentSalary) maxSalary = currentSalary;
            sum += salary[i];
        }
        return (sum - minSalary - maxSalary) / (salary.length - 2);
    }
}
