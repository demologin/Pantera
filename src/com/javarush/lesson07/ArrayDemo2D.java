package com.javarush.lesson07;

public class ArrayDemo2D {
    public static void main(String[] args) {
        int[][] myArray = cleateArray2D();
        fillZero(myArray);
        printArray2D(myArray);
    }

    private static int[][] cleateArray2D() {
        return new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9}, //0
                {9, 1, 2, 3, 4, 5, 6, 7, }, //1
                {9, 8, 7, 6, 5, 4, 3, }, //2
        };
    }

    private static void fillZero(int[][] myArray) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < myArray[row].length; col++) {
                if ((col+row) % 2 == 0) {
                    myArray[row][col] = 0;
                }
            }
        }
    }

    private static void printArray2D(int[][] myArray) {
        for (int i = 0; i < 3; i++) {
            for (int element : myArray[i]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
