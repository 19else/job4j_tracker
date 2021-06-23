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


    public Map<String, Student> collectListToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors
                        .toMap(
                                Student::getSurname,
                                s -> s,
                                (source, duplicate) -> source)
                );
    }
}
