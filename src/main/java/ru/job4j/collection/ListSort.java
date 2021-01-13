package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 6, 1, 2);
        System.out.println("Начальный список: " + list);
        Collections.sort(list);
        System.out.println("Отсортированный список: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Отсортированный список в обратном порядке: " + list);
        Integer first = 3;
        Integer second = 2;
        int rsl = first.compareTo(second);
        if (rsl < 0) {
            System.out.println("Входящее значение больше текущего");
        } else
        System.out.println("Текущее значение больше входящего: " + rsl);
        System.out.println();
        String petr = "Zet";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
            System.out.println("Разница ASCII первой буквы текущего слова и первой буквы входящего слова равна: " + rslStr);
    }
}
