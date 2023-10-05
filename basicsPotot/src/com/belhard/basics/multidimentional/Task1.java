package com.belhard.basics.multidimentional;

import java.util.Scanner;

import com.belhard.basics.utilits.UserInputUtilities;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = UserInputUtilities.createAndFillMultidimentionalArrayRandomInt(scan);

        UserInputUtilities.showMultidimentionalArrayInt(arr);
    }

}
