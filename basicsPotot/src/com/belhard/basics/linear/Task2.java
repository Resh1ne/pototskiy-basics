package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = UserInputUtilities.userInputDouble(scan, "Enter the number(nnn.bbb): ");
        num = solveTask(num);
        UserInputUtilities.messageResultDouble("Result: ", num);
    }

    private static double solveTask(double num) {
        checkNum(num);
        double temp = num;
        num -= (int) temp;
        temp -= num;
        num *= 1000;
        temp /= 1000;
        num += temp;
        return num;
    }

    private static void checkNum(double num) {
        if (num < 100 || num > 999.999) {
            throw new RuntimeException("Incorrect input!");
        }
    }
}
