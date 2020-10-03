package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index > data.length || index < 0) {
             throw new IllegalArgumentException("Index " + index + " out of bonds");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        System.out.println(Find.get(data, 2));
        String rsl = Find.get(data, -2);
        System.out.println(rsl);

    }
}
