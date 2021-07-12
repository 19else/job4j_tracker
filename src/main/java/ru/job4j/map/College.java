package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {

    private final Map<Student, Set<Subject>> studentSetMap;

    public College(Map<Student, Set<Subject>> studentSetMap) {
        this.studentSetMap = studentSetMap;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student student : studentSetMap.keySet()) {
            if (student.getAccount().equals(account)) {
                rsl = Optional.of(student);
                break;
            }
        }
        return rsl;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> a = findByAccount(account);
        if (a.isPresent()) {
            Set<Subject> subjects = studentSetMap.get(a.get());
            for (Subject s : subjects) {
                if (s.getName().equals(name)) {
                    rsl = Optional.of(s);
                    break;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> studentSetMap = Map.of(
                new Student("Student", "00001", "201-13"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(studentSetMap);
        Optional<Student> student = college.findByAccount("00001");
        if (student.isPresent()) {
            System.out.println("Найден студент - " + student.get().getName());
        } else {
            System.out.println("Account is not found");
        }
        System.out.println();
        Optional<Subject> english = college.findBySubjectName("00001", "English");
        english.ifPresent(subject -> System.out.println("Оценка по найденному предмету - " + subject.getScore()));
    }
}
