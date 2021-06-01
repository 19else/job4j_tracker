package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] tasks = {
                "1. Task",
                "2. Task",
                "11. Task",
                "15. Task"
        };
        Comparator<String> cmpText = (left, right) -> {
            int first = Integer.valueOf(left.substring(0, left.indexOf(".")));
            int second = Integer.valueOf(right.substring(0, right.indexOf(".")));
            return first - second;
        };
        Comparator<String> cmpDescSize = (o1, o2) -> {
            int first = Integer.parseInt(o1.substring(0, o1.indexOf(".")));
            int second = Integer.parseInt(o2.substring(0, o2.indexOf(".")));
            return Integer.compare(second, first);
        };
        Arrays.sort(tasks, cmpText);
        System.out.println("Sort Ascending = " + Arrays.toString(tasks));
        Arrays.sort(tasks, cmpDescSize);
        System.out.println("Sort descending = " + Arrays.toString(tasks));
    }
}
