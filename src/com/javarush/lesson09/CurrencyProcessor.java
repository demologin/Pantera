package com.javarush.lesson09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class CurrencyProcessor {
    public static void main(String[] args) {
        String text = "RUR\nUSD, EUR, GBP,    JPY\nBYR,     BTC\nUAH, \nend";
        Scanner scanner = new Scanner(text);
        StringBuilder dynText = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            dynText.append(" ").append(line);
        }
        String result = dynText.toString();

        StringTokenizer stringTokenizer = new StringTokenizer(result, " ,\t\n\r\f");
        int size = stringTokenizer.countTokens();
        String[] currencies = new String[size];
        int index = 0;
        while (stringTokenizer.hasMoreTokens()) {
            currencies[index++] = stringTokenizer.nextToken();
        }

        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (String currency : currencies) {
            stringJoiner.add(currency);
        }
        String out = stringJoiner.toString();
        System.out.println(out);
    }
}
