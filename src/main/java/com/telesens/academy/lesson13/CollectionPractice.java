package com.telesens.academy.lesson13;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson10.CompareDresses;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CollectionPractice {

    public static void main(String[] args) {
        EntityDress[] array = CompareDresses.getExpectedDresses();
        // Demo converting Array to List
        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        List<EntityDress> list = convertArrayToList(array);
        System.out.println("List:");
        System.out.println(list);
    }
    // TODO - конвертировать List в массив
    public static EntityDress[] convertListToArray(List<EntityDress> list) {
        return null;
    }

    // TODO - конвертировать массив в List
    public static List<EntityDress> convertArrayToList(EntityDress[] array) {
        return null;
    }

    // TODO - конвертировать массив в Map в качестве ключа взять поле model
    public static Map<String, EntityDress> convertArrayToMap(EntityDress[] array) {
        return null;
    }

    // TODO - проверить, равны ли два списка
    public static boolean checkEqualLists(List<EntityDress> list1, List<EntityDress> list2) {
        return false;
    }

    // TODO - конвертировать Map в List
    public static List<EntityDress> convertMapToList(Map<String, EntityDress> map) {
        return null;
    }

    // TODO - конвертировать List в Массив (массив содержит только String - значения поля model)
    public static String[] convertListToModelArray(List<EntityDress> list) {
        return null;
    }

    // TODO - конвертировать отфильтровать List, оставив только позиции по заданному цвету
    public static List<EntityDress> filterByColor(List<EntityDress> list, String color) {
        return null;
    }
}
