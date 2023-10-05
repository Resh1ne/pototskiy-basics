package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput input = input(scan);
        double result = result(input.x, input.y);
        UserInputUtilities.messageResultDouble("Result: ", result);

    }

    private static class UserInput {
        double x;
        double y;
    }

    private static UserInput input(Scanner scan) {
        UserInput out = new UserInput();

        out.x = UserInputUtilities.userInputDouble(scan, "Enter x: ");
        out.y = UserInputUtilities.userInputDouble(scan, "Enter y: ");
        return out;
    }

    private static double result(double x, double y) {
        double denominator = (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        UserInputUtilities.checkDenominator(denominator);
        double result = (Math.sin(x) + Math.cos(y)) / denominator;
        return result;
    }
}