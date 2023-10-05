package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = UserInputUtilities.userInputInt(scan, "Enter the positive number: ");
        int result = solveTask(num);

        UserInputUtilities.messageResultInt("Result: ", result);
    }

    private static int solveTask(int num) {
        checkPositive(num);

        int result = 0;
        for (int i = 0; i < num; i++) {
            result += i;
        }
        return result;
    }

    private static void checkPositive(int num) {
        if (num < 0) {
            throw new RuntimeException("Number not positive!");
        }
    }
}
