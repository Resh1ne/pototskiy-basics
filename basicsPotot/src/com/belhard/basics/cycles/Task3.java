package com.belhard.basics.cycles;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task3 {

    public static void main(String[] args) {
        int result = solveTask();
        UserInputUtilities.messageResultInt("Result: ", result);
    }

    private static int solveTask() {
        int result = 0;
        for (int i = 0; i < 101; i++) {
            result += i * i;
        }
        return result;
    }
}
