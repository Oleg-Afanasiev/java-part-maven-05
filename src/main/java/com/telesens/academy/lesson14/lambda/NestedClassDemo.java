package com.telesens.academy.lesson14.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedClassDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two");
        System.out.println(list);
        list.add("three");
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            int x = 0;
//            x++;
            class LocalClass {
                public  void method() {
                    System.out.println(x);
//                    x++;
                }
            }

            LocalClass lc = new LocalClass();
        }
    }
}
