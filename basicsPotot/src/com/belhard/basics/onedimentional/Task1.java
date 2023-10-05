package com.belhard.basics.onedimentional;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = arr(scan);
        int result = solveTask(scan, arr);
        UserInputUtilities.messageResultInt("Result: ", result);

    }

    private static int[] arr(Scanner scan) {
        int[] arr = UserInputUtilities.createAndFillArrayRandomInt(scan, "Enter the number of numbers in the array: ");
        UserInputUtilities.showArrayInt(arr);
        return arr;
    }

    private static int solveTask(Scanner scan, int[] arr) {
        int k = UserInputUtilities.userInputInt(scan, "\nEnter the divisor ");
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                result += arr[i];
            }
        }
        return result;
    }
}
