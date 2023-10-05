package com.belhard.basics.multidimentional;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = UserInputUtilities.createAndFillMultidimentionalArrayRandomInt(scan);
        UserInputUtilities.showMultidimentionalArrayInt(arr);
        arr = sort(scan, arr);
        UserInputUtilities.showMultidimentionalArrayInt(arr);
    }

    private static int[][] sortingArrayStringsInDescendingOrder(int[][] arr) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length - 1; j++) {
                    if (arr[i][j] < arr[i][j + 1]) {
                        int temp;
                        temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                        flag = true;
                    }
                }
            }
        }
        return arr;
    }

    private static int[][] sortingArrayStringsInAscendingOrder(int[][] arr) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length - 1; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        int temp;
                        temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                        flag = true;
                    }
                }
            }
        }
        return arr;
    }

    private static int[][] sort(Scanner scan, int[][] arr) {
        System.out.println("1. Sorting array rows in ascending order");
        System.out.println("2. Sorting array rows in descending order");
        int temp = UserInputUtilities.userInputInt(scan, "");

        if (temp == 1) {
            arr = sortingArrayStringsInAscendingOrder(arr);
        } else if (temp == 2) {
            arr = sortingArrayStringsInDescendingOrder(arr);
        } else {
            throw new RuntimeException("Incorrect input!");
        }
        return arr;
    }
}
