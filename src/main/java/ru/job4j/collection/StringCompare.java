package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int count = 0;
        if (o1.length() == o2.length()) {
            while (count < o2.length()) {
                int comp = Character.compare(o1.charAt(count), o2.charAt(count));
                if (comp == 0) {
                    count++;
                } else {
                    return Integer.compare(o1.charAt(count), o2.charAt(count));
                }
            }
        }
        return Integer.compare(o1.length(), o2.length());
    }
}
