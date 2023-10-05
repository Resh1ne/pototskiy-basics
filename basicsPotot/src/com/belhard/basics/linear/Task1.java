package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput user = input(scan);
        int result = solveTask(user.a, user.b, user.c);
        UserInputUtilities.messageResultInt("Result: ", result);
    }

    private static class UserInput {
        int a;
        int b;
        int c;
    }

    private static UserInput input(Scanner scan) {
        UserInput out = new UserInput();
        out.a = UserInputUtilities.userInputInt(scan, "Enter a: ");
        out.b = UserInputUtilities.userInputInt(scan, "Enter b: ");
        out.c = UserInputUtilities.userInputInt(scan, "Enter c: ");
        return out;
    }

    private static int solveTask(int a, int b, int c) {
        int result = ((a - 3) * b / 2) + c;
        return result;
    }
}
