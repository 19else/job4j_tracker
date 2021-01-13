package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSort {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(1, "Merkel"),
                new Item(3, "Chaves"),
                new Item(2, "Trump"),
                new Item(4, "Kennedy")
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println("Sort by number: " + items);
        Collections.sort(items, Collections.reverseOrder());
        System.out.println("Sort descending: " + items);
        Collections.sort(items, new SortByName());
        System.out.println("Sort by name: " + items);
    }
}
