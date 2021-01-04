package com.exam;

public class Bitwiseop {
    public static void main(String[] args) {

        int result = 25 | 12;
        // 12 = 01100, 25 = 11001
        // 12 | 25 = 11101 = 29
        System.out.println(result);

        result = 25 & 12;
        // 25 & 12 = 8
        System.out.println(result);

        result = 25 ^ 12;
        // 25 ^ 12 = 21
        System.out.println(result);

        result = ~25;
        // ~25 = -26
        System.out.println(result);

        result = 2 << 2;
        // right shift twice 2 = 8
        System.out.println(result);

        result = 8 >> 2;
        // left shift twice 8 = 2;
        System.out.println(result);

        result = 8 >> 1;
        // right shift once 8 = 4;
        System.out.println(result);

        result = 8 >>> 2;
        // unsigned right shift twice 8 = 2
        System.out.println(result);

        result = -8 >>> 2;
        // unsigned right shift twice -8 = large number
        System.out.println(result);
    }

}
