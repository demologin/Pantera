package com.javarush.lesson07;

import java.util.Scanner;

public class SalaryDemo2D {

    public static final int COUNT_SALARIES = 4;

    public static void main(String[] args) {
        String input= """
                3
                Ivanov
                Petrov
                Sidorov
                100 200 300 400
                200 333 444 555
                500 666 777 888
                """;

        Scanner scanner = new Scanner(input);
        //input data
        System.out.println("Input size report: ");
        int size = scanner.nextInt();
        String[]  persons = new String[size];
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Input Person name[" + i + "]: ");
            persons[i] = scanner.next();
        }

        int[][] salaries = new int[size][COUNT_SALARIES];
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Input " + COUNT_SALARIES + " salaries for " + persons[i] + ": ");
            for (int j = 0; j < COUNT_SALARIES; j++) {
                salaries[i][j] = scanner.nextInt();
            }
        }
        //output data
        System.out.println();
        String title = "|     Name      |  Quart1  Quart2  Quart3  Quart4 |  Sum  |";
        String line = "-".repeat(title.length());
        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        int total = 0;
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("| %10s    |", persons[i]);
            int sum=0;
            int[] oneRow = salaries[i];
            for (int salary : oneRow) {
                sum += salary;
                System.out.printf("  %4d  ", salary);
            }
            System.out.printf(" | %5d |\n", sum);
            total += sum;
        }
        System.out.println(line);
        double average = (double) total / persons.length;
        System.out.printf("Total: $%-7d |   Average: $%-7.2f\n", total, average);

    }
}
