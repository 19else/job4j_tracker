package ru.job4j.steam;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(40, "Surname4"),
                new Student(50, "Surname5"),
                new Student(70, "Surname7"),
                new Student(90, "Surname9")
        );
        School school = new School();
        Predicate<Student> predicate = score -> score.getScore() >= 70;
        List<Student> rsl = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70, "Surname7"));
        expected.add(new Student(90, "Surname9"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student(20, "Surname2"),
                new Student(30, "Surname3"),
                new Student(50, "Surname5"),
                new Student(60, "Surname6"),
                new Student(80, "Surname8")
        );
        School school = new School();
        Predicate<Student> predicate = score ->
                score.getScore() >= 50
                && score.getScore() < 70;
        List<Student> rsl = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname5"));
        expected.add(new Student(60, "Surname6"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassC() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4"),
                new Student(60, "Surname6"),
                new Student(90, "Surname9")
        );
        School school = new School();
        Predicate<Student> predicate = score ->
                score.getScore() > 0
                && score.getScore() < 50;
        List<Student> rsl = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Surname1"));
        expected.add(new Student(30, "Surname3"));
        expected.add(new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectListToMap() {
        List<Student> students = Arrays.asList(
                new Student(10, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(30, "Sidorov"),
                new Student(40, "Ivanov"),
                new Student(50, "Sidorov")
        );
        School school = new School();
        Map<String, Object> rsl = school.collectListToMap(students);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(40, "Ivanov"));
        expected.add(new Student(20, "Petrov"));
        expected.add(new Student(50, "Sidorov"));
        assertThat(rsl, is(expected));
    }
}