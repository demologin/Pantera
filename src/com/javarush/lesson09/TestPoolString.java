package com.javarush.lesson09;

import java.util.Scanner;

public class TestPoolString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hello1=scanner.nextLine();
        hello1=hello1.intern();
        String hello2=new String("Hello World");
        System.out.println(hello1.equals(hello2));
    }
}
