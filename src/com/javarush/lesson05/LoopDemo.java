package com.javarush.lesson05;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        String startWhile = "start while";
        startWhile = startWhile + "!";
        System.out.println(startWhile);
        {
            int n = -1;
            while (n != 0) {
                System.out.println(n++);
            }
        }
        String finishWhile = "finish while";
        System.out.println(finishWhile);

        System.out.println("start for");
        int counter = 0;
        for (int n = 500; n >= -500; n -= 100) {
            System.out.println(++counter + ": n=" + n);
        }
        System.out.println("finish for");

        System.out.println("start do while");
        {
            int n = -1;
            do {
                System.out.println(n);
                n++;
            } while (n != 0);
            System.out.println("finish do while");
        }

        String[] strings={"one", "two", "three","four","five","six","seven","eight","nine"};
        for (int i = 0, stringsLength = strings.length; i < stringsLength; i++) {
            String s = strings[i];
            System.out.println(s);
        }

    }

}
