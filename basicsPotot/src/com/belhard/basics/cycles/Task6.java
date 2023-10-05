package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first nubmer: ");
        String first = sc.nextLine();
        int lenFirst = first.length();

        System.out.println("Enter the second nubmer: ");
        String second = sc.nextLine();
        int lenSecond = second.length();

        int longestStr = 0;
        int shortestStr = 0;

        if (lenFirst > lenSecond) {
            System.out.println("Longest line: " + first);
            longestStr = lenFirst;
            shortestStr = lenSecond;
        } else {
            System.out.println("Longest line: " + second);
            longestStr = lenSecond;
            shortestStr = lenFirst;
        }

        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();

        for (int i = 0; i < shortestStr; i++) {
            for (int j = 0; j < longestStr; j++) {
                if (lenFirst < lenSecond) {
                    if (firstCharArray[i] == secondCharArray[j]) {
                        System.out.println(secondCharArray[j]);
                        break;
                    }
                } else {
                    if (secondCharArray[i] == firstCharArray[j]) {
                        System.out.println(firstCharArray[j]);
                        break;
                    }
                }
            }

            sc.close();

        }

    }
}
