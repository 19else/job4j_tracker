package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Nik");
        names.add("Floyd");
        for (Object value : names)
              {
                  System.out.println(value);
        }
    }
}
