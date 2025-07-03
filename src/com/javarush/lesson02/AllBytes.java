package com.javarush.lesson02;

public class AllBytes {
    public static void main(String[] args) {
        for (byte i = -128; i <= 127; i++) {
            System.out.println(i+" "+Integer.toBinaryString(i));
        }
    }
}
