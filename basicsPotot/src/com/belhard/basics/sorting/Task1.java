package com.belhard.basics.sorting;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = UserInputUtilities.createAndFillArrayRandomInt(scan, "Enter the number of numbers in the array: ");
        UserInputUtilities.showArrayInt(arr);
        arr = sortBubble(arr);
    }

    private static int[] sortBubble(int[] arr) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("\n");
        UserInputUtilities.showArrayInt(arr);
        return arr;
    }

}
