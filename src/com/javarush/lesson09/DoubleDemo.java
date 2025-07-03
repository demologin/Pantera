package com.javarush.lesson09;

public class DoubleDemo {
    public static void main(String[] args) {
        double[] array = {
                0f, Double.MIN_VALUE, 1. / 16, 1d, 16, 1023, 1024, Double.MAX_VALUE, Double.POSITIVE_INFINITY,
                -0.0, -1 * Double.MIN_VALUE, -1. / 16, -1d, -16, -1023, -1024, -1 * Double.MAX_VALUE, Double.NEGATIVE_INFINITY,
        };
        for (double element : array) {
            long l = Double.doubleToLongBits(element);
            String binaryString = Long.toBinaryString(l);
            String bin = "%64s".formatted(binaryString).replace(' ', '0');
            System.out.println(bin + " = " + element);
        }
    }
}
