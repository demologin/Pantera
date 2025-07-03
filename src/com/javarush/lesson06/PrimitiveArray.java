package com.javarush.lesson06;

public class PrimitiveArray {
    public static void main(String[] args) {
        int size = 10;
        byte[] bytes = new byte[size];
        short[] shorts = new short[size]; //20 bytes
        int[] ints = new int[size]; //40 bytes
        long[] longs = new long[]{1L, Long.MAX_VALUE, Long.MIN_VALUE};

        Object floats = new float[]{1.0f, 2f, 3L, 4, 5, 6};
        double[] doubles = {1.0, 2d, 3L, 4, 5, 6};

        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};

        boolean[] booleans = {true, false, true};

    }
}


