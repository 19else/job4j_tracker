package ru.job4j.map;

import org.junit.Test;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CollegeTest {

    @Test
    public void whenAccountIsOptionalEmpty() {
        Map<Student, Set<Subject>> students = Map.of(
                new Student("Student1", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                ),
                new Student("Student2", "000002", "201-18-15"),
                Set.of(
                        new Subject("Economic", 75),
                        new Subject("Sociology", 65)
                )
        );
        College college = new College(students);
        assertThat(college.findByAccount("000010"), is(Optional.empty()));
    }

    @Test
    public void whenAccountIsOptionalNotEmpty() {
        Map<Student, Set<Subject>> studentSetMap = Map.of(
                new Student("Tom", "001", "20-1-21"),
                Set.of(
                        new Subject("History", 70),
                        new Subject("Sociology", 85)
                ),
                new Student("Poul", "002", "20-1-21"),
                Set.of(
                        new Subject("Physics", 75),
                        new Subject("Astronomy", 55)
                )
        );
        College college = new College(studentSetMap);
        assertThat(college.findByAccount("001").get().getGroup(), is("20-1-21"));
    }

    @Test
    public void whenSubjectIsOptionalEmptyWithNotFoundAccount() {
        Map<Student, Set<Subject>> setMap = Map.of(
                new Student("Bill", "001", "22-01-21"),
                Set.of(
                        new Subject("Russian", 70),
                        new Subject("English", 85)
                ),
                new Student("Jerry", "002", "22-01-21"),
                Set.of(
                        new Subject("Philosophy", 75),
                        new Subject("Psyсhology", 65)
                )

        );
        College college = new College(setMap);
        assertThat(college.findBySubjectName("003", "Psycology"), is(Optional.empty()));
    }

    @Test
    public void whenSubjectIsOptionalEmptyWithFoundAccount() {
        Map<Student, Set<Subject>> students = Map.of(
                new Student("Bob", "001", "20-1-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                ),
                new Student("Roy", "002", "20-1-15"),
                Set.of(
                        new Subject("Economic", 75),
                        new Subject("Sociology", 65)
                )
        );
        College college = new College(students);
        assertThat(college.findBySubjectName("001", "Sociology"), is(Optional.empty()));
    }

    @Test
    public void whenSubjectIsOptionalNotEmpty() {
        Map<Student, Set<Subject>> students = Map.of(
                new Student("John", "000001", "2020-1-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                ),
                new Student("Mary", "000002", "2020-1-15"),
                Set.of(
                        new Subject("Economic", 75),
                        new Subject("Sociology", 65)
                )
        );
        College college = new College(students);
        assertThat(college.findBySubjectName("000002", "Sociology").get().getScore(), is(65));
    }
}