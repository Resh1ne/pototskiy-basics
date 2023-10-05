package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Interval interval = input(scan);
        solveTask(interval.m, interval.n);
    }

    private static class Interval {
        int m;
        int n;
    }

    private static Interval input(Scanner scan) {
        Interval out = new Interval();
        out.m = UserInputUtilities.userInputInt(scan, "Enter the start of the interval (m): ");
        out.n = UserInputUtilities.userInputInt(scan, "Enter the end of the interval (n): ");
        return out;
    }

    private static void solveTask(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.println("Number divisors: " + i);

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println("Divisors: " + j);
                }
            }
        }
    }
}
