package com.telesens.academy.lesson14.iterator;

import java.util.Iterator;

public class Words implements Iterable<String> {
    private String firstWord;
    private String secondWord;
    private String thirdWord;

    public Words(String firstWord, String secondWord, String thirdWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.thirdWord = thirdWord;
    }

    @Override
    public Iterator<String> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements  Iterator<String> {
        private int n = 1; // номер текущего слова

        @Override
        public boolean hasNext() {
            return n <= 3; // пока номер не превышает кол-во слов
        }

        @Override
        public String next() {
            // в этот методе возвращаем следующее слово
            switch (n++) {
                case 1:
                    return firstWord;

                case 2:
                    return secondWord;

                case 3:
                    return thirdWord;

                default:
                    return null;
            }
        }
    }
}
