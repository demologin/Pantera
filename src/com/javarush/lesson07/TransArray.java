package com.javarush.lesson07;

import java.util.Arrays;

public class TransArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 0}, // 1 4 7
                {4, 5, 6, 0}, // 2 5 8
                {7, 8, 9, 0},  // 3 6 9
                {1, 4, 7, 9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array[i].length; j++) {
                int temp = array[i][j]; //0 2
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
