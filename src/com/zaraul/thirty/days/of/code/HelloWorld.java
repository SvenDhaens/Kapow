package com.zaraul.thirty.days.of.code;

import java.util.Scanner;

public class HelloWorld implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, World.");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(input);
    }
}
