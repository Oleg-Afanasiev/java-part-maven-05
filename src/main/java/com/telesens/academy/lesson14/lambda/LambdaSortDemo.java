package com.telesens.academy.lesson14.lambda;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson10.CompareDresses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        EntityDress[] dresses = CompareDresses.getExpectedDresses();
        List<EntityDress> listDresses = new ArrayList<>(Arrays.asList(dresses));
        // 1 способ
        System.out.println(listDresses);
        listDresses.sort(new DressComparator());
        System.out.println(listDresses);

        // 2 способ
        Comparator<EntityDress> sortByPriceDesc = new Comparator<EntityDress>() {
            @Override
            public int compare(EntityDress dress1, EntityDress dress2) {
                return Double.compare(dress2.getPrice(), dress1.getPrice());
            }
        };
        System.out.println("****sort by price Desc****");
        listDresses.sort(sortByPriceDesc);
        System.out.println(listDresses);

        // 3  способ (лямбда выражения)
        Comparator<EntityDress> sortByModel =
                (dress1, dress2)-> dress1.getModel().compareTo(dress2.getModel());

        System.out.println("****sort by model****");
        listDresses.sort(sortByModel);
        System.out.println(listDresses);

        // 4  способ (лямбда выражения)
        System.out.println("****sort by name****");
        listDresses.sort((d1, d2)->d1.getName().compareTo(d2.getName()));
        System.out.println(listDresses);

        // 5  способ (лямбда выражения)
        System.out.println("****sort by color****");
        listDresses.sort(Comparator.comparing(EntityDress::getColor));
        System.out.println(listDresses);
}
}
