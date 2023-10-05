package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CornersTriangle corners = inputCorners(scan);
        Triangle triangle = solveTask(corners.first, corners.second, corners.third);

        result(triangle.triangle, triangle.recrangularTriangle);
    }

    private static class Triangle {
        boolean triangle;
        boolean recrangularTriangle;
    }

    private static class CornersTriangle {
        double first;
        double second;
        double third;
    }

    private static CornersTriangle inputCorners(Scanner scan) {
        CornersTriangle out = new CornersTriangle();

        out.first = UserInputUtilities.userInputDouble(scan, "Enter the first corner: ");
        out.second = UserInputUtilities.userInputDouble(scan, "Enter the second corner: ");
        out.second = checkTriangleAndCreateThird(out.first, out.second);
        return out;
    }

    private static double checkTriangleAndCreateThird(double first, double second) {
        double third;
        if (first > 180 || second > 180 || first < 0 || second < 0) {
            throw new RuntimeException("Not correct corner");
        } else if ((second + first) >= 180) {
            throw new RuntimeException("Don't exist!");
        } else {
            third = 180 - first - second;
            System.out.println("third corner = " + third);
        }
        return third;
    }

    private static Triangle solveTask(double first, double second, double third) {
        Triangle out = new Triangle();
        if (second == 90 || first == 90 || third == 90) {
            out.triangle = true;
            out.recrangularTriangle = true;
        } else {
            out.triangle = true;
        }
        return out;
    }

    private static void result(boolean triangle, boolean recrangularTriangle) {
        if (recrangularTriangle) {
            System.out.println("Recrangulat triangle ");
        } else if (!recrangularTriangle && triangle) {
            System.out.println("Triangle exist!");
        } else {
            System.out.println("Triangle not exist!");
        }
    }
}
