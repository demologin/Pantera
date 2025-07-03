package com.javarush.lesson08;

import java.util.Arrays;
import java.util.Scanner;

public class MethodDemoGrades {
    public static void main(String[] args) {
        String input = """
                10
                11 -22 33 44 55 66 77 88 99 -42
                """;

        Scanner scanner = new Scanner(input);
        int[] grades = getGrades(scanner);
        MethodDemoGrades methodDemoGrades = new MethodDemoGrades();
        methodDemoGrades.printArray(grades);
        int sum = getSum(grades);
        int median = median(grades);

        System.out.println("Sum: " + sum);
        System.out.println("Median: " + median);
        printArray(grades, "{", ":", "}");
        printArray(grades, "(", ")");
        printArray(grades, "/", "/");
        int negativeValue = findNegative(grades);
        System.out.println("Negative value: " + negativeValue);
    }

    private static int[] getGrades(Scanner scanner) {
        int count = scanner.nextInt();
        int[] grades = new int[count];
        for (int i = 0; i < count; i++) {
            grades[i] = scanner.nextInt();
        }
        return grades;
    }

    private static int findNegative(int[] grades) {
        for (int grade : grades) {
            if (grade < 0) {
                return grade;
            }
        }
        return 0;
    }

    private static void printArray(int[] grades, String left, String right) {
        printArray(grades, left, ", ", right);
    }

    public void printArray(int[] grades) {
        printArray(grades, "[", ", ", "]");
    }

    private static void printArray(int[] array, String leftBracket, String delimiter, String rightBracket) {
        System.out.print(leftBracket);
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.print(element);
            if (i != array.length - 1) {
                System.out.print(delimiter);
            } else {
                System.out.println(rightBracket);
            }
        }
    }

    private static int getSum(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    private static int median(int[] array) {
        array = array.clone();
        Arrays.sort(array);
        int medianPosition = array.length / 2;
        return array[medianPosition];
    }
}
