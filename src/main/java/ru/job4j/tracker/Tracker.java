package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if(items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
         return Arrays.copyOf(items, size);
    }

    @Override
    public String toString() {
        return "Tracker{" +
                "items=" + Arrays.toString(items) +
                ", ids=" + ids +
                ", size=" + size +
                '}';
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
            for (int index = 0; index < size; index++) {
                Item names = items[index];
                if(names.getName().equals(key)) {
                    result[count++] = names;
                }
            }
            return Arrays.copyOf(result, count);
        }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден, возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
   /**     Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
       return rsl;
    **/

    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return index != -1 ? true : false;
    }






}