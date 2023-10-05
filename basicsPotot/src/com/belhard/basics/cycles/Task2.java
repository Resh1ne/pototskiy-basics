package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput user = input(scan);
        double result = result(user.a, user.b, user.h);
        UserInputUtilities.messageResultDouble("Result: ", result);
    }

    private static class UserInput {
        double a;
        double b;
        double h;
    }

    private static UserInput input(Scanner scan) {
        UserInput out = new UserInput();
        out.a = UserInputUtilities.userInputDouble(scan, "Enter segment(a): ");
        out.b = UserInputUtilities.userInputDouble(scan, "Enter segment(b): ");
        out.h = UserInputUtilities.userInputDouble(scan, "Enter step: ");
        return out;
    }

    private static double result(double a, double b, double h) {
        double result = 0;
        for (double i = a; i <= b; i += h) {
            result = a > 2 ? (a + 4) : ((-a) * 2);
            System.out.println("Result: " + result);
            a += h;
        }
        return result;
    }
}
