package ru.job4j.function;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        //при объявлении функционального интерфейса мы указываем два типа обобщения и в лямбду,
        // соответственно, передаем 2 параметра.
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumer = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = supplier.get();
        int i = 1;
        for (String s : strings) {
            consumer.accept(i++, " is " + s);
        }

        // single interface
        Supplier<String> sup = () -> "New string for Interface - this is single interface ";
        Consumer<String> consumerSingle = (s) -> System.out.println(s);
        consumerSingle.accept(sup.get());

        //BiInterface
        Supplier<String> sup1 = () -> "New String For Interface";
        BiConsumer<String, String> consumer1 = (s, s1) -> System.out.println(s + s1);
        consumer1.accept(sup1.get(), " and Second String");
//        System.out.println(sup.get());
//        for (String s : strings) {
//            System.out.println(s);
//        }

        // Predicate (BiPredicate)
        Predicate<String> predicate = s -> s.isEmpty();
        System.out.println("Строка пустая " + predicate.test(""));
        System.out.println("Строка пустая " + predicate.test("test"));

        BiPredicate<String, Integer> cond = (str, integ) -> str.contains(integ.toString());
        System.out.println("Строка содержит подстроку: " + cond.test("name123", 123));
        System.out.println("Строка содержит подстроку: " + cond.test("Name", 456));

        // Function
        Function<String, Character> func = s -> s.charAt(2);
        System.out.println("Третий символ в строке = " + func.apply("fiRst"));
        System.out.println("Третий символ в строке = " + func.apply("seCond"));

        //BiFunction
        BiFunction<String, Integer, String> biFunc = (s, n) -> s.concat(" ").concat(n.toString());
        System.out.println("Результат работающей бифункции: " + biFunc.apply("Name", 123));
        System.out.println("Результат работающей бифункции: " + biFunc.apply("String number",12345));

        //UnaryOperator и
        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("Главрыба")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("абырвалГ")));

        //BinaryOperator
        BinaryOperator<StringBuilder> binaryOperator = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после объединения: " + binaryOperator.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
