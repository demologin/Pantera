package com.javarush.lesson05;

public class Table {
    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            for (int i = 2; i < 10; i++) {
                System.out.print("\t"+i+"*"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
