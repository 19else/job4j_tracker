package ru.job4j.steam;

import ru.job4j.ex.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }


    public static Map<String, Object> collectListToMap(List<Student> students) {
      return  students.stream()
                //.distinct()
                .collect(Collectors
                                .toMap(
                        Student::getSurname,
                        Student::getClass,
                        (str, obj) -> str.equals(obj) ? str:obj));

    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(10, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(30, "Sidorov"),
                new Student(40, "Ivanov"),
                new Student(50, "Sidorov")
        );
        System.out.println(collectListToMap(students));
    }
}
