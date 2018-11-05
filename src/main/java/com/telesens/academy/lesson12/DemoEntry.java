package com.telesens.academy.lesson12;

import java.math.BigInteger;
import java.util.Arrays;

public class DemoEntry {
    public static void main(String[] args) {
        Entry[] entries = {
                new Entry(12L, "name1"),
                new Entry(11L, "name4"),
                new Entry(10L, "name3")
        };
        // Вывести
        System.out.println(Arrays.toString(entries));

        // Сортировать
        Arrays.sort(entries);
        System.out.println(Arrays.toString(entries));

        // Сортировать
        Arrays.sort(entries, new ByKeyComparator());
        System.out.println(Arrays.toString(entries));

        EntryObj[] entryObj = {
                new EntryObj("12", 1L),
                new EntryObj("11", 2L),
                new EntryObj("10", 3L)
        };

    //        generics


        EntryGeneric<String, BigInteger> entry1 = new EntryGeneric<>("12", BigInteger.ZERO);
        EntryGeneric<String, String> entry2 = new EntryGeneric<>("13", "22");
        EntryGeneric<String, BigInteger> entry3 = new EntryGeneric<>("14", BigInteger.valueOf(34L));

        EntryGeneric [] entryGen = new EntryGeneric[3];
        entryGen[0] = entry1;
        entryGen[1] = entry2;
        System.out.println(entryGen[0]);
        System.out.println(entryGen[1]);
    }
}
