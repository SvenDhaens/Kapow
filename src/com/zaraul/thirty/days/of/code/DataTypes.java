package com.zaraul.thirty.days.of.code;

import java.util.Scanner;

public class DataTypes implements Runnable{
    @Override
    public void run() {
        System.out.println("12\n" +
                "4.0\n" +
                "is the best place to learn and practice coding!");
        System.out.println("use above as input----------");
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int number;
        double decimal;
        String text;

        number = scan.nextInt();

        decimal = scan.nextDouble();
        scan.nextLine();

        text = scan.nextLine();

        System.out.println(number + i);
        System.out.println(decimal + d);
        System.out.println(s + text);

        scan.close();
    }
}
