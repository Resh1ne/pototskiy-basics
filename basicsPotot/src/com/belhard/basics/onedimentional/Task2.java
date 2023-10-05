package com.belhard.basics.onedimentional;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = arr(scan);

        Counter count = solveTask(arr);

        result(count.positiv, count.negativ, count.elNull);
    }

    private static double[] arr(Scanner scan) {
        double[] arr = UserInputUtilities.createAndFillArrayRandomDouble(scan,
                "Enter the number of numbers in the array: ");
        UserInputUtilities.showArrayDouble(arr);
        return arr;
    }

    private static class Counter {
        int positiv;
        int negativ;
        int elNull;
    }

    private static Counter solveTask(double[] arr) {
        Counter out = new Counter();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                out.negativ++;
            } else if (arr[i] > 0) {
                out.positiv++;
            } else {
                out.elNull++;
            }

        }
        return out;
    }

    private static void result(int positiv, int negativ, int elNull) {
        System.out.println("\n" + positiv);
        System.out.println(negativ);
        System.out.println(elNull);
    }
}
