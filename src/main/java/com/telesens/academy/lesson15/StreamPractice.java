package com.telesens.academy.lesson15;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson10.CompareDresses;

import java.util.Arrays;

public class StreamPractice {
    public static void main(String[] args) {
        EntityDress[] array = CompareDresses.getExpectedDresses();

        Arrays.stream(array)
                .forEach(System.out::println);
    }
}
