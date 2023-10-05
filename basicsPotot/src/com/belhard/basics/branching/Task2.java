package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = UserInputUtilities.userInputDouble(scan, "Enter x: ");

        double y = solveTask(x);

        UserInputUtilities.messageResultDouble("Enter y =  ", y);
    }

    private static double solveTask(double x) {
        double y;
        double denominator = 0;
        if (x <= 3) {
            y = Math.pow(x, 2) - 3 * x + 9;
        } else {
            denominator = x * x * x + 6;
            UserInputUtilities.checkDenominator(denominator);
            y = 1 / denominator;
        }
        return y;
    }

}
