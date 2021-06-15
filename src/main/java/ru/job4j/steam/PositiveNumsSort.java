package ru.job4j.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumsSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                9, -8, 7, -6, 5, -4, 3, -2, 1, 0);
        List<Integer> positive = numbers.stream().filter(
                integer -> integer > 0
        ).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
