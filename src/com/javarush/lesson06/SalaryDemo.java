package com.javarush.lesson06;

import java.util.Scanner;

public class SalaryDemo {
    public static void main(String[] args) {
        String input= """
                3
                Ivanov
                Petrov
                Sidorov
                100
                200
                500
                """;

        Scanner scanner = new Scanner(input);
        //input data
        System.out.print("Input size report: ");
        int size = scanner.nextInt();
        String[]  persons = new String[size];
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Input Person name[" + i + "]: ");
            persons[i] = scanner.next();
        }

        int[] salaries = new int[size];
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Input salary for " + persons[i] + ": ");
            salaries[i] = scanner.nextInt();
        }
        //output data
        System.out.println();
        String title = "|     Name      |       Salary       |";
        String line = "-".repeat(title.length());
        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        int sum = 0;
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("| %10s    |        $%-6d     |\n", persons[i], salaries[i]);
            sum += salaries[i];
        }
        System.out.println(line);
        double average = (double) sum / persons.length;
        System.out.printf("Total: $%d     |   Average: $%-7.2f\n", sum, average);

    }
}
