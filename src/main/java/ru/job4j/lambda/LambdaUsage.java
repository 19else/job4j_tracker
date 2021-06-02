package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] names = {
                "1. Tasks",
                "15. Tasks",
                "11. Tasks",
                "3. Tasks",
        };
        Comparator<String> cmpText = (left, right) -> {
            int first = Integer.valueOf(left.substring(0, left.indexOf(".")));
            int second = Integer.valueOf(right.substring(0, right.indexOf(".")));
            System.out.println("compare - " + first + " : " + second);
            return Integer.compare(first, second);
        };
        Comparator<String> cmpDescSize = (o1, o2) -> {
            int first = Integer.valueOf(o1.substring(0, o1.indexOf(".")));
            int second = Integer.valueOf(o2.substring(0, o2.indexOf(".")));
            System.out.println("compare - " + first + " : " + second);
            return Integer.compare(second, first);
        };
        Arrays.sort(names, cmpText);
        System.out.println("Sort Ascending = " + Arrays.toString(names));
        Arrays.sort(names, cmpDescSize);
        System.out.println("Sort Descending = " + Arrays.toString(names));
    }
}
