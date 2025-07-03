package com.javarush.lesson07;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[][] myArray = {
                {0, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {2, 2, 3, 4, 5},
                {3, 1, 4, 4, 4},
                {4, 2, 3, 4, 5},
                {5, 2, 3, 4, 5},
        };
        for (int[] row : myArray) {
            System.out.println(Arrays.toString(row));
        }

    }

}
