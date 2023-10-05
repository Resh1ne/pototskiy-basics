package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput input = input(scan);
        result(input.x, input.y);
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

    private static void result(double x, double y) {
        if ((x == 0) && (y == -1)) {
            System.out.println("False");
        } else if ((x >= -2 && x <= 2) && (y >= -3 && y <= 4)) {
            System.out.println("True");
        } else if ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}