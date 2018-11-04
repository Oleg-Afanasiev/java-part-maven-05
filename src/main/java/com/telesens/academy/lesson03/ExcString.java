package com.telesens.academy.lesson03;

import java.util.Arrays;

public class ExcString {
    public static void main(String[] args) {

        excercise1();
        excercise2();
    }
    //    Вывести на консоль треки от 10 до 15 включительно
    private static void excercise2() {
        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        for (String track : tracks) {
            if (isTrackInRange(track, 10, 15))
                System.out.println(track);
        }
    }

    private static boolean isTrackInRange(String track, int from, int to) {
        int n = Integer.parseInt(track.substring(track.length()-2));
        if (n >= from && n <= to)
            return true;
        else
            return  false;
    }

    private static void excercise1() {
        String testData = "petrov,Ivanov ,KiRill,    Helen    , IvaN";

        String[] rawNames =  splitDataToArray(testData);
        printArray(rawNames);
        String[] formattedNames = formatNames(rawNames);
        printArray(formattedNames);
        String filteredData = filterByFirstSymbol(formattedNames, 'K');
        System.out.println(filteredData);
    }

    private static String filterByFirstSymbol(String[] formattedNames, char symb) {
        StringBuilder sb = new StringBuilder();
        for (String name : formattedNames) {
            if (name.charAt(0) != symb)
                sb.append(name + " ");
        }

        return sb.toString();
    }

    private static String[] formatNames(String[] rawNames) {
        String[] formattedNames = new String[rawNames.length];

        for (int i = 0; i < rawNames.length; i++) {
            formattedNames[i] = formatName(rawNames[i]);
        }
        return formattedNames;
    }

    //    1 Имя не должно содержать пробелов в начале и в конце
    //    2 Имя начинается с большой буквы
    //    3 Все символы, кроме первого в нижнем регистре
    private static String formatName(String rawName) {
        // 1
        String nameWithoutSpace = rawName.trim();
        String lastPart=nameWithoutSpace.substring(1).toLowerCase();
        String firstSymb=nameWithoutSpace.substring(0, 1).toUpperCase();
        return firstSymb+lastPart;
    }

    private static void printArray(String[] rawNames) {
        // 1 попытка
//        System.out.println(rawNames.toString());
        // 2
//        for(int i = 0; i < rawNames.length; i++)
//            System.out.println(rawNames[i]);

        // 3
//        System.out.println("*******");
//        for (String element : rawNames) {
//            System.out.println(element);
//        }

        // 4
        System.out.println("*******");
        System.out.println(Arrays.toString(rawNames));
    }

    private static String[] splitDataToArray(String testData) {
        String[] words = testData.split(",");
        return words;
    }


}
