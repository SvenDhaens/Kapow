package com.zaraul.thirty.days.of.code;

import java.util.Scanner;

public class Arrays2D implements Runnable{

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int size = 6;
        int arr[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(calculateMax(arr));
    }

    private static int calculateMax(int[][] field) {
        int total = 0;
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 6; x++) {
                Integer sumHourGlass = getHourGlassesTotal(field, x, y);
                if(sumHourGlass!=null){
                    total = total < sumHourGlass ? sumHourGlass : total;
                }
            }
        }
        return total;
    }

    private static Integer getHourGlassesTotal(int[][] arr, int x, int y) {
        if (x >= 0 && (x + 2) < arr.length && x >= 0 && (y + 2) < arr.length) {
            return getValueWithinConstraint(arr,y,x) + getValueWithinConstraint(arr,y,x + 1) + getValueWithinConstraint(arr,y,x + 2)
                    + getValueWithinConstraint(arr,y+ 1,x + 1)
                    + getValueWithinConstraint(arr,y + 2,x) + getValueWithinConstraint(arr,y + 2,x + 1) + getValueWithinConstraint(arr,y + 2,x + 2);
        } else return null;
    }

    private static Integer getValueWithinConstraint(int[][] array, int y, int x) {
        int value = array[y][x];
        return value <= 9 && value >= -9 ? value : null;
    }
}
