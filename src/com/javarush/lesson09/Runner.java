package com.javarush.lesson09;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Source root: " + Constants.SOURCE_ROOT);
        System.out.println("PI: " + Math.PI);
        double[] doubleValues = Constants.doubleValues;
        doubleValues[1]=1234;
        System.out.println(Arrays.toString(doubleValues));
    }
}
