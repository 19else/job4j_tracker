package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] first = left.split("\\.");
        String[] second = right.split("\\.");
        int rslFirst = Integer.parseInt(first[0]);
        int rslSecond = Integer.parseInt(second[0]);
        return Integer.compare(rslFirst, rslSecond);
    }
}
