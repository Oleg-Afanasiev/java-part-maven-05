package com.telesens.academy.lesson13;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson10.CompareDresses;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {
        EntityDress[] array = CompareDresses.getExpectedDresses();
        // Demo converting Array to List
        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        List<EntityDress> list = convertArrayToList(array);
        System.out.println("List:");
        System.out.println(list);
        EntityDress[] arrayFromList = convertListToArray(list);
        System.out.println("Array from List:");
        System.out.println(Arrays.toString(arrayFromList));

        System.out.println("Array to map: ");
        Map<String, EntityDress> map = convertArrayToMap(array);
        System.out.println(map);

        System.out.println("Filter list by orange: ");
        List<EntityDress> filteredList = filterByColor(list, "Orange");
        System.out.println(filteredList);
    }
    public static EntityDress[] convertListToArray(List<EntityDress> list) {
//        return list.toArray(new EntityDress[]{});
        return (EntityDress[]) list.toArray();
    }

    public static List<EntityDress> convertArrayToList(EntityDress[] array) {
        return  Arrays.asList(array);
    }

    public static Map<String, EntityDress> convertArrayToMap(EntityDress[] array) {
        Map<String, EntityDress> map = new HashMap<>();
        // 1 Способ
//        for (int i = 0; i<array.length; i++) {
//            String model = array[i].getModel();
//            EntityDress dress = array[i];
//            map.put(model, dress);
//        }
//        return map;

        // 2 способ
        for (EntityDress dress: array) {
            map.put(dress.getModel(), dress);
        }
        return map;
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

    public static List<EntityDress> filterByColor(List<EntityDress> list, String color) {
        List<EntityDress> filteredDresses = new ArrayList<>();
        for (EntityDress dress : list){
            if (dress.getColor().equals(color)){
                filteredDresses.add(dress);
            }
        }
        return filteredDresses;
    }
}
