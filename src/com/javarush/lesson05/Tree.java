package com.javarush.lesson05;

public class Tree {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row < height; row++) {
            int left = height - row;
            int right = height + row;{
            for (int col = 1; col < 2 * height; col++) {
                System.out.print(col >= left && col <= right
                        ? "*"
                        : ".");
            }
            System.out.println();}
        }
    }

}
