package com.telesens.academy.lesson14.iterator;

public class WordsDemo {
    public static void main(String[] args) {
        Words words = new Words("Hello ", "World", "!");
        for (String word : words) {
            System.out.print(word);
        }
    }
}
