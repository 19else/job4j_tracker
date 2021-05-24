package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    public boolean empty(String s) {
        return s.isEmpty();
    }

    public boolean predicateEmpty(String s) {

        return check(String::isEmpty, s);
    }

    public boolean startWith(String s, String pref) {
        return s.startsWith(pref);
    }

    public boolean predicateStartWith(String s, String pref) {
        return check(str -> str.startsWith(pref), s);
    }

    public boolean contains(String s, String key) {
        return s.contains(key);
    }

    public boolean check(Predicate<String> predicate, String s) {
        return predicate.test(s);
    }

    public String transform(Function<String, String> fun, String s) {
        return fun.apply(s);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println("Используем разные методы:");
        System.out.println("usage.contains: " + usage.contains("Sergey", "e"));
        System.out.println("usage.empty: " + usage.empty(""));
        System.out.println("usage.startWith: " + usage.startWith("Sergey", "S"));
        System.out.println("boolean predicateStartWith: " + usage.predicateStartWith(
                "Andrey", "A"));
        //Use Predicate
        System.out.println("Используем один метод check " +
                " с разными экземплярами Predicate: ");
        System.out.println("Результат работы: " + usage.check(
                String::isEmpty, ""));
        System.out.println("Результат работы: " + usage.check(
                str -> str.startsWith("Fun"), "Functional interface"
        ));
        System.out.println("Результат работы: " + usage.check(
                str -> str.contains("rn"), "Surname Name"
        ));
        System.out.println("Строка после преобразования: " + usage.transform(
                String::toUpperCase, "ToDaY is happy"
        ));
        System.out.println(
                usage.transform(
                        str -> str.concat("работает корректно."), "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        String::trim, "    aBC dertFR Lmnp RStyU        "
                )
        );
    }
}
