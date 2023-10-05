package com.belhard.basics.utilits;

import java.util.Scanner;

public class UserInputUtilities {
    public static int userInputInt(Scanner scan, String str) {
        System.out.print(str);
        int a;
        if (scan.hasNextInt()) {
            a = scan.nextInt();
        } else {
            throw new RuntimeException("You did not enter an integer!");
        }
        return a;
    }

    public static String userInputString(Scanner scan, String str) {
        System.out.print(str);
        String a;
        if (scan.hasNextLine()) {
            a = scan.nextLine();
        } else {
            throw new RuntimeException("You did not enter an integer!");
        }
        return a;
    }

    public static double userInputDouble(Scanner scan, String str) {
        System.out.print(str);
        double a;
        if (scan.hasNextDouble()) {
            a = scan.nextDouble();
        } else {
            throw new RuntimeException("You did not enter an double!");
        }
        return a;
    }

    public static void messageResultInt(String str, int result) {
        System.out.println(str + result);
    }

    public static void messageResultDouble(String str, double result) {
        System.out.println(str + result);
    }

    public static void messageResultChar(String str, char result) {
        System.out.println(str + result);
    }

    public static void checkDenominator(double denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator == 0! ");
        }
    }

    public static void checkSqrt(double sqrt) {
        if (sqrt <= 0) {
            throw new RuntimeException("Sqrt <= 0! ");
        }
    }

    public static int[] createAndFillArrayRandomInt(Scanner scan, String str) {
        System.out.print(str);
        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 200) - 99);
        }
        return arr;
    }

    public static void showArrayInt(int[] arr) {
        System.out.println("Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static double[] createAndFillArrayRandomDouble(Scanner scan, String str) {
        System.out.print(str);
        double[] arr = new double[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((double) (Math.random() * 200) - 99);
        }
        return arr;
    }

    public static void showArrayDouble(double[] arr) {
        System.out.println("Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[][] createAndFillMultidimentionalArrayRandomInt(Scanner scan) {
        System.out.print("Rows: ");
        int rows = scan.nextInt();
        System.out.print("Columns: ");
        int cols = scan.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = ((int) (Math.random() * 51) - 25);
            }
        }
        return arr;
    }

    public static void showMultidimentionalArrayInt(int[][] arr) {
        System.out.println("Array: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sortingBubbleArrayStrings(int[][] arr) {
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

    public static int[][] sortingBubbleArrayColumns(int[][] arr) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] < arr[i + 1][j]) {
                        int temp;
                        temp = arr[i][j];
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = temp;
                        flag = true;
                    }
                }
            }
        }
        return arr;
    }
}
