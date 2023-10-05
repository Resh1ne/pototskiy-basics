package com.belhard.basics.cycles;

import java.math.BigInteger;

public class Task5 {

    public static void main(String[] args) {
        result();
    }

    private static class Num {
        BigInteger result = new BigInteger("1");
        BigInteger value = new BigInteger("1");
        BigInteger temp = new BigInteger("1");
    }

    private static Num result() {
        Num solve = new Num();

        for (int i = 0; i < 199; i++) {
            BigInteger pow = new BigInteger("0");
            pow = solve.value.multiply(solve.value);
            solve.result = solve.result.multiply(pow);
            solve.value = solve.value.add(solve.temp);
            System.out.println(solve.result + "\n");
        }
        return solve;
    }
}
