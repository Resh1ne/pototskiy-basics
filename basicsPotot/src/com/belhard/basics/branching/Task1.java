package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = userInput(scan);
        int result = solveTask(user.a, user.b, user.c, user.d);
        UserInputUtilities.messageResultInt("Max: ", result);
    }

    private static class User {
        int a;
        int b;
        int c;
        int d;
    }

    private static User userInput(Scanner scan) {
        System.out.println("Find:  max{min(a, b), min(c, d)}");
        User out = new User();
        out.a = UserInputUtilities.userInputInt(scan, "Enter a: ");
        out.b = UserInputUtilities.userInputInt(scan, "Enter b: ");
        out.c = UserInputUtilities.userInputInt(scan, "Enter c: ");
        out.a = UserInputUtilities.userInputInt(scan, "Enter d: ");
        return out;
    }

    private static int solveTask(int a, int b, int c, int d) {
        int minAB = a < b ? a : b;
        int minCD = c < d ? c : d;
        int result = minAB > minCD ? minAB : minCD;
        return result;
    }

}
