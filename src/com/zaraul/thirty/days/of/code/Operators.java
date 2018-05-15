package com.zaraul.thirty.days.of.code;

import java.util.Scanner;

public class Operators implements Runnable {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);

        double mealCost;
        int tipPercent;
        int taxPercent;

        mealCost = scan.nextDouble();
        tipPercent = scan.nextInt();
        taxPercent = scan.nextInt();

        int total = (int)mealCost + getPercentage(mealCost, tipPercent)
                + getPercentage(mealCost, taxPercent);

        System.out.println("The total meal cost is " + total + " dollars.");
    }

    public static int getPercentage(double cost, int percentage) {
        double f = cost / 100.0 * percentage;
        return (int) Math.round(f);
    }
}
