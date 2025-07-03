package com.javarush.lesson06;

import java.util.Arrays;

class LinksDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0, aLength = a.length; i < aLength; i++) {
            int j = a[i];
            int element = j;
            element = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
