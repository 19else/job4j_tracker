package ru.job4j.steam;

import java.util.stream.Stream;

public class GenCard {
    public static void main(String[] args) {
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        Stream.of(suits)
                .flatMap( suit -> Stream.of(values)
                .map(value -> suit + " " + value))
                .forEach(System.out::println);
     }
}
