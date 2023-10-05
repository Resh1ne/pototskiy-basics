package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput input = input(scan);
        double result = solveTask(input.a, input.b, input.c);
        UserInputUtilities.messageResultDouble("Result: ", result);
    }

    private static class UserInput {
        double a;
        double b;
        double c;
    }

    private static UserInput input(Scanner scan) {
        UserInput out = new UserInput();

        out.a = UserInputUtilities.userInputDouble(scan, "Enter a: ");
        out.b = UserInputUtilities.userInputDouble(scan, "Enter b: ");
        out.c = UserInputUtilities.userInputDouble(scan, "Enter c: ");
        return out;
    }

    private static double solveTask(double a, double b, double c) {
        double sqrt = (b * b) + (4 * a * c);
        UserInputUtilities.checkSqrt(sqrt);
        double part1 = b + Math.sqrt(sqrt);
        double denominator = 2 * a;
        UserInputUtilities.checkDenominator(denominator);
        double result = (part1 / denominator) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return result;
    }
}
