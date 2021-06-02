package ru.job4j.lambda;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return left.compareTo(right);
        };
        Comparator<String> cmpDescSize = (o1, o2) -> {
            System.out.println("compare - " + o1 + " : " + o2);
            return Integer.compare(o2.length(), o1.length());
        };
    }
}
