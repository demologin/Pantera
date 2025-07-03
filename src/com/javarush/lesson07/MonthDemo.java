package com.javarush.lesson07;

import java.util.Arrays;

public class MonthDemo {
    public static void main(String[] args) {
        int[][] months = {
                {31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}
        };

        int[][][] array3D={{

                {31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}
        },
                {
                {31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}
        },
                {{1,2,3},{3,4,56},{6,7,8}},
        };



        //print(months);
        System.out.println(array3D[2][1][2]);
    }

    private static void print(int[][] months) {
        for (int i = 0; i < months.length; i++) {
            int numbQuart = i + 1;
            System.out.println("Q #" + numbQuart + ": " + Arrays.toString(months[i]));
        }
    }
}
