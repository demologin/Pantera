package com.javarush.lesson03;

import java.util.Scanner;

public class DemoIf {

    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 45;
    public static final int MIN_JUNIOR_SALARY = 300;
    public static final int MAX_JUNIOR_SALARY = 600;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Привет! Начинаем собес");
        int age = getIntValue("Укажите возраст",
                "Так и запишем. Возраст %d\n",
                "Реально %s??? Прикольно!!\n"
        );
        int salary = getIntValue("Укажите ожидания по з.п. в $$$",
                "Так и запишем. З.П. $%d\n",
                "Никогда не видел такой зарплаты: %s! Вот это да!!\n");

        int experience = getIntValue("Укажите ваш опыт коммерческой разработки",
                "Так и запишем. Опыт %d\n",
                "Тут нет никакой ошибки: %s??? Ну хорошо!!\n");

        boolean isJunior = isJunior(age, salary, experience);
        boolean isSenior = !(experience < 4)
                           && age > 22 && age < 65
                           && salary >= 2500 && salary <= 4500;
        if (isJunior) {
            System.out.println("Ok. Нам нужны джуны");
        } else if (isSenior) {
            System.out.println("Ok. Нам повезло!!!");
        }

        if (isSenior || isJunior) {
            String position = isJunior
                    ? " junior"
                    : " senior";
            System.out.printf("Можем предложить позицию %s\n", position);
        } else {
            System.out.println("Мы вам перезвоним!");
        }


    }

    private static boolean isJunior(int age, int salary, int experience) {
        return experience == 0
               && age > MIN_AGE && age < MAX_AGE
               && salary >= MIN_JUNIOR_SALARY && salary <= MAX_JUNIOR_SALARY;
    }

    private static int getIntValue(String question, String correctFormatWithInt, String incorrectFormatWithString) {
        System.out.println(question);
        int value = 0;
        if (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                System.out.printf(correctFormatWithInt, value);
            } else {
                String word = scanner.next();
                System.out.printf(incorrectFormatWithString, word);
            }
        }
        return value;
    }
}
