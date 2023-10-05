package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = UserInputUtilities.userInputInt(scan, "Enter the nubmer: ");
        checkTime(t);
        Time result = solveTask(t);
        checkTimeInput(result.timeH, result.timeMin, result.timeSec);

    }

    private static Time solveTask(int t) {
        Time out = new Time();
        out.timeH = t / 3600;
        out.timeMin = t / 60 - out.timeH * 60;
        out.timeSec = t - out.timeMin * 60 - out.timeH * 3600;
        return out;
    }

    private static class Time {
        int timeH;
        int timeMin;
        int timeSec;
    }

    private static void checkTime(int t) {
        if (t < 0) {
            throw new RuntimeException("Incorrect input!");
        }
    }

    private static void checkTimeInput(int timeH, int timeMin, int timeSec) {
        if (timeH < 10) {
            System.out.print("0" + timeH + "h ");
        } else {
            System.out.print(timeH + "h ");
        }

        if (timeMin < 10) {
            System.out.print("0" + timeMin + "min ");
        } else {
            System.out.print(timeMin + "min ");
        }

        if (timeSec < 10) {
            System.out.print("0" + timeSec + "s ");
        } else {
            System.out.print(timeSec + "s ");
        }
    }
}
