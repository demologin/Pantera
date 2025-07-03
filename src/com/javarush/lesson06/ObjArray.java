package com.javarush.lesson06;

import java.util.Arrays;

class ObjArray {
    public static void main(String[] args) {
        String[] strings = new String[10];
        for (int i = 0; i < strings.length - 3; i++) {
            strings[i] = "#" + i;
        }

        String[] strings2 = strings;
        strings2[2] = null;
        System.out.println(Arrays.toString(strings));

        Arrays.fill(strings2, null);
    }
}
