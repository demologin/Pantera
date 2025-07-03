package com.javarush.lesson02;

public class Primitives {
    public static void main(String[] args) {
        //numbers
        byte b = 127;
        short s = Short.MAX_VALUE;
        int a = 2147483647;
        long l = 2147483648L;

        float f = 1.234F;
        double d = 1.234;

        char c = 65;
        boolean bool = false;

        char x = (char) (c + 1);
        System.out.println(x);

    }
}
