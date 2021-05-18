package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (integerNumber, stringVar)
                -> map.put(integerNumber, stringVar);

        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");
        biConsumer.accept(3, "three");
        biConsumer.accept(4, "four");
        biConsumer.accept(5, "five");
        biConsumer.accept(6, "six");
        biConsumer.accept(7, "seven");

        BiPredicate<Integer, String> biPredicate = (num, word)
                -> num % 2 == 0 || word.length() == 4;
        for (Integer i : map.keySet()) {
            if (biPredicate.test(i, map.get(i))) {
                System.out.println("if: " + "key: " + i + " value: " + map.get(i));
            }
        }
        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        Consumer<String> con = System.out::println;
        Function<String, String> function = String::toUpperCase;
        con.accept(function.apply(supplier.get().toString()));
        for (String s : supplier.get())  {
            System.out.println(s + " is ->" + function.apply(s));
        }
    }
}
