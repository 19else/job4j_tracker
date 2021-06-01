package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] names = {
                "Donald",
                "Tom",
                "Benjamin",
                "John",
        };
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return right.compareTo(left);
        };
        Comparator<String> cmpDescSize = (o1, o2) -> {
            System.out.println("compare - " + o1 + " : " + o2);
            return Integer.compare(o2.length(), o1.length());
        };
        Arrays.sort(names, cmpText);
        System.out.println("Sort Ascending = " + Arrays.toString(names));
        Arrays.sort(names, cmpDescSize);
        System.out.println("Sort Descending = " + Arrays.toString(names));
    }
}
