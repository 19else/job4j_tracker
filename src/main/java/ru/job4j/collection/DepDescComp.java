package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int first = o1.length();
        int second = o2.length();
        int min = Math.min(first, second);
        for (int i = 0; i < min ; i++) {
            int rsl = Character.compare(o1.charAt(i), o2.charAt(i));
            if (rsl != 0) {
                System.out.println(rsl);
                return rsl;
            }
        }
        System.out.println(Integer.compare(first, second));
        return Integer.compare(first, second);
    }
}
