package com.javarush.lesson05;

import java.util.Scanner;

public class BreakContinueSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start game! Get sum=100");
        int sum = 0;
        while (true) {
            System.out.print("Input number: ");
            int input = scanner.nextInt();
            if (input <0) {
                System.out.println("Invalid input! Negative skipped!");
                continue;
            }
            sum += input;
            if (sum == 100) {
                System.out.println("You are winner");
                break;
            }
        }
        System.out.println("Game over");

    }
}
