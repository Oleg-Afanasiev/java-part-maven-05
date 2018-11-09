package com.telesens.academy.lesson14.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        String res = doSomethingWithString(str, s->s.toUpperCase());
        String res2 = doSomethingWithString(str, String::toLowerCase);
        System.out.println(res);
        System.out.println(res2);
        // TODO
        boolean isInRange = checkNumber(10, null);
        System.out.println(isInRange);
//        LambdaDemo lambdaDemo = new LambdaDemo();
//        String resNext = lambdaDemo.doSomethingWithStringNoStatic(str);
    }

    private static String doSomethingWithString(String str, Function<String, String> operation) {
        return operation.apply(str);
    }

    private static boolean checkNumber(int number, Predicate<Integer> checker) {
        return checker.test(number);

    }

    private String doSomethingWithStringNoStatic(String str) {
        return null;
    }
}
