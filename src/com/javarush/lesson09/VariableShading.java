package com.javarush.lesson09;

public class VariableShading {
    public static int count = 0;
    public String name;

    public void add(int data) {
        sum = sum + data;
        int sum = data * 2;
        count++;
        System.out.println("Local sum=" + sum + " Field sum=" + this.sum + ", count=" + count);
    }

    public int sum = 0;


    public static void main(String[] args) {
        VariableShading solution1 = new VariableShading();
        solution1.add(10);
        VariableShading solution2 = new VariableShading();
        solution2.add(100);
        solution2.add(1000);
    }
}
