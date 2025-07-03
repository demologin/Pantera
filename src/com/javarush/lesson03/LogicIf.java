package com.javarush.lesson03;

import java.util.Scanner;

public class LogicIf {

    public static final int MIN_AGE = 16;
    public static final int MAX_AGE = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isWorker = age >= MIN_AGE && age <= MAX_AGE;
        String message = isWorker
                ? "You are a worker"
                : "You are not a worker";
        System.out.println(message);
    }
}
