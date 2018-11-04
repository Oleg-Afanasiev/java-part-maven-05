package com.telesens.academy.lesson03;

public class Array2DMain {
    public static void main(String[] args) {
        String[][] testData = {
                {"1", "Ivan", "23"},
                {"2", "Helen", "35"},
                {"3", "Peter", "19"},
        };

        provideTestData(testData);
    }

    public static void testUser(long id, String name, int age) {
        System.out.println("Test started");
        System.out.println("id=" + id);
        System.out.println("Test finished");
    }

    public static void provideTestData(String[][] testData) {
        for (int i = 0; i < testData.length; i++) {
            long id = Long.parseLong(testData[i][0]);
            String name = testData[i][1];
            int age = Integer.parseInt(testData[i][2]);
            testUser(id, name, age);
        }
    }
}
