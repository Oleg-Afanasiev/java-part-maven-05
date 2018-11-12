package com.telesens.academy.lesson15;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson10.CompareDresses;

import java.util.Arrays;

public class StreamPractice {
    public static void main(String[] args) {
        EntityDress[] dresses = CompareDresses.getExpectedDresses();

        // Вывести только с цветом 'Orange'
        // и с максимальной ценой
        Arrays.stream(dresses)
                .filter(s->s.getColor().equals("Orange"))
                .reduce(StreamPractice::maxByPrice)
//                .reduce((e1, e2)-> e1.getPrice() > e2.getPrice() ? e1 : e2)
                .ifPresent(System.out::println);

        // 1) Вычленить только цену
        // 2) отсортировать по убыванию
        // 3) Вывести результат
        // 4) Сохранить в массив Double[] prices
        Arrays.stream(dresses);
    }

    private static EntityDress maxByPrice(EntityDress e1, EntityDress e2) {
        if (e1.getPrice() > e2.getPrice())
            return e1;
        else
            return e2;
    }
}
