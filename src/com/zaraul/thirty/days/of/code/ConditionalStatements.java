package com.zaraul.thirty.days.of.code;

import java.util.Scanner;

public class ConditionalStatements implements Runnable {

    private static final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void run() {

        int number = SCANNER.nextInt();
        /*Given an integer, , perform the following conditional actions:

        If  is odd, print Weird
        If  is even and in the inclusive range of 2 to 5, print Not Weird
        If  is even and in the inclusive range of 6 to 20, print Weird
        If  is even and greater than 20, print Not Weird*/

        String result = "";
        if (number % 2 != 0) {
            result = "Weird";
        } else {
            if (number >= 2){
                if(number >= 6 && number <= 20){
                    result = "Weird";
                } else {
                    result = "Not Weird";}
            }
        }
        System.out.println(result);
    }
}
