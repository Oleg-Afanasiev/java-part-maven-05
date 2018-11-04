package com.telesens.academy.lesson03;

import java.util.Scanner;

/*
1) Напишите программу, которая:
        - считывает строку
        - выводит исходную строку
        - выводит количество и список слов, которые начинаются на букву 'd'
*/
public class Task1 {
    public static void main(String[] args) {
        String str = readStringFromConsole();
        printStringToConsole(str);
        selectAndPrintWords(str,'d');
    }

    private static void selectAndPrintWords(String str, char symbol) {
        String[] words = str.split(" ");
        int sum = 0;
        for (String word : words) {
            if (word.charAt(0) == symbol) {
                System.out.println(word);
                sum++;
            }
        }

        System.out.println(
                String.format("Кол-во слов, начинающихся на '%s' равно %d", symbol, sum));
    }

    private static void printStringToConsole(String str) {
        System.out.println(String.format("Исходная строка: %s", str));
    }

    private static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
