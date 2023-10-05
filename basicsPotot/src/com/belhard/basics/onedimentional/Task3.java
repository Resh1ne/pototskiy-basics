package com.belhard.basics.onedimentional;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = arr(scan);
        int[] newArr = solveTask(arr);

        System.out.println("\n");
        UserInputUtilities.showArrayInt(newArr);
    }

    private static int[] arr(Scanner scan) {
        System.out.print("Enter the number of numbers in the array: ");
        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 6) - 5);
        }
        UserInputUtilities.showArrayInt(arr);
        return arr;
    }

    private static int[] solveTask(int[] arr) {
        int temp = Integer.MAX_VALUE;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
                counter = 1;
            } else if (arr[i] == temp) {
                counter++;
            }
        }

        int[] newArr = new int[arr.length - counter];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newArr;
    }
}
