package com.javarush.lesson02;


import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String line = scanner.next();
        System.out.println(a + b);
        System.out.println("line=" + line);
    }
}
