package ru.job4j.tracker;
import java.lang.reflect.Array;
import java.util.*;

public class Tracker {
  //  private final Item[] items = new Item[100];
    private final List<Item[]> items = new List<>();
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;

        for (int index = 0; index < size; index++) {
          //  if(items[index].getId() == id) {
            if(items.get(index).equals(id)) {

                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
       // items[size++] = item;
        items.add(size++,item);
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
        return items.set(size, items);
    }

    @Override
    public String toString() {
        return "Tracker{" +
                "items=" + items +
                ", ids=" + ids +
                ", size=" + size +
                '}';
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
            for (int index = 0; index < size; index++) {
                Item[] names = items.get(index);
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
        return index != -1 ? items.get(index) : null;
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
        if(index == -1) {
            return false;
        }
       // items[index] = item;
        items.set(index, item);
        return true;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
       if(index == -1) {
           return false;
       }
            int start = index + 1;
            int length = size - index;
            System.arraycopy(items, start, items, index, length);
            items.get(start).getId();
            //items[size - 1] = null;
              items.set(size-1, null);
            size--;
        return true;
    }
}