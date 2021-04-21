package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;


public class DepDescComp implements Comparator<String> {

    public int compare(String o1, String o2) {
        String[] firstOne = o1.split("/");
        String[] secondTwo = o2.split("/");
          int rsl = secondTwo[0].compareTo(firstOne[0]);
        return rsl == 0 ? o1.compareTo(o2) : rsl;
    }
}
