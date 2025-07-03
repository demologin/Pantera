package com.javarush.lesson03;


import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You are older than 18");
        } else if (age >= 16) {
            System.out.println("Your age > 15 and < 19");
        } else if (age >= 0) {
            System.out.println("Your age < 16");
        }
    }
}
