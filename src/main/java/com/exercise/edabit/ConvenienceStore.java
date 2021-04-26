package com.exercise.edabit;

/*
    Given a total due and an array representing the amount of change in your pocket,
    determine whether or not you are able to pay for the item.
    Change will always be represented in the following order: quarters, dimes, nickels, pennies.

    To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true,
    since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.
 */
public class ConvenienceStore {

    public static void main(String[] args) {
        int[] changes = {25, 20, 5, 0};
        double due = 4.25;
        boolean result = new ConvenienceStore().changeEnough(changes, due);
        System.out.println(result);
    }

    private boolean changeEnough(int[] change, double amountDue) {
        double totalChange = change[0]*0.25 + change[1]*0.1 + change[2]*0.05 + change[3]*0.01;
        return totalChange >= amountDue;
    }
}
