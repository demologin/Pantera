package com.javarush.lesson09;

public class CypherSystem {
    public static void main(String[] args) {
        String title="  DEC  BIN  OCT  HEX";
        String line = "=".repeat(title.length());
        int[] array = {0,1,2,3,4, 0b101,6,7,8,011,'\n',0xB, 0b1100, 015,14,0xF};
        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        for (int element : array) {
            String binaryString = Integer.toBinaryString(element);
            String bin = String.format("%4s", binaryString).replace(" ","0");
            System.out.printf(" %04d %4s %4o %4X\n",element,bin,element,element);
        }
        System.out.println(line);
    }
}
