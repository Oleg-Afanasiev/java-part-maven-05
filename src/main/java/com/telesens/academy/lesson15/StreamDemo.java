package com.telesens.academy.lesson15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] strArray = {"One", "two", "hello", "bla-blla-bla", "hell", "ella"};
        Arrays.stream(strArray) // на конвеер
                .filter(s->s.contains("ll"))
                .filter(s->s.charAt(0) == 'h')
//                .filter(StreamDemo::filterStringByLL)
//                .forEach(new ConsumerImpl()); // действие над каждым элементом
//                .forEach(s->System.out.println(s)); // действие над каждым элементом
                .forEach(System.out::println); // действие над каждым элементом


        // Пример 2
        System.out.println("Пример 2");
        Integer[] intArray = {4, 5, 2, 5, -2, 666, 0, Integer.MAX_VALUE};
        Integer[] results = Arrays.stream(intArray)
                .filter(n -> n > 0 && n < 10)
                .sorted((n1, n2) -> n2.compareTo(n1))
//                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
//                .forEach(System.out::println);

        System.out.println(Arrays.toString(results));

        // Массив в List
        List<Integer> resultList = Arrays.stream(results)
                .collect(Collectors.toList());

        System.out.println(resultList);

        // // Массив в List
        List<Integer> listIntegers = new ArrayList<>();
        listIntegers.add(-1);
        listIntegers.add(-2);
        listIntegers.add(-3);

        Arrays.stream(results)
                .forEach(listIntegers::add);

        System.out.println(listIntegers);


        Integer[] finalArray = listIntegers.stream()
                .filter(n -> n < 0)
                .peek(System.out::println) // продолжаем стрим после операции
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(finalArray));

        // Lazy
        System.out.println("Lazy");
        Stream<Integer> peek = Arrays.stream(finalArray)
                .peek(System.out::println);

        peek.count();

        // Пример 3
        System.out.println("Пример 3");
        String[] strNumbers = {"1", "2", "33"};
        Arrays.stream(strNumbers)
//                .map(s-> Integer.parseInt(s))
//                .map(Integer::parseInt)
                .mapToInt(Integer::parseInt)
                .filter(n-> n > 0 && n < 10)
                .mapToObj(Objects::toString)
                .forEach(System.out::println);

        // Пример 4
        System.out.println("Пример 4");

        Integer[][] array2D = {{1, 2, 3}, {40, 50, 60, 70}, {100, 200, 300}};
        Optional<Integer> max = Arrays.stream(array2D)
//                .map(Arrays::toString)
                .flatMap(Arrays::stream) // из одного элемента сделать много (стрим)
                .peek(System.out::println)
                .max(Integer::compareTo);

        System.out.println("Max: " + max.get());

        // Пример 5
        System.out.println("Пример 5 - генерация");
        Stream.generate(()->new Random().nextInt())
                .limit(10)
                .forEach(System.out::println);
    }


    private static boolean filterStringByLL(String str) {
        return str.contains("ll");
    }
}
