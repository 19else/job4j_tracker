package ru.job4j.collection;

import java.util.*;

public class Department {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    tmp.add(start + "/" + el);
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    orgs.sort(Comparator.naturalOrder());

    }

    public static void sortDesc(List<String> orgs) {
    DepDescComp sort = new DepDescComp();
    orgs.sort(sort);

    }
}
