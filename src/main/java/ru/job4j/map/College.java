package ru.job4j.map;

import java.util.Map;
import java.util.Set;

public class College {

    private final Map<Student, Set<Subject>> studentSetMap;

    public College(Map<Student, Set<Subject>> studentSetMap) {
        this.studentSetMap = studentSetMap;
    }

//    public Student findByAccount(String account) {
//        for (Student s : studentSetMap.keySet()) {
//            if (s.getAccount().equals(account)) {
//                return s;
//            }
//        }
//        return null;
//    }
    public Student findByAccount(String account) {
        return studentSetMap.keySet()
                .stream()
                .filter(f -> f.getAccount().equals(account))
                .findFirst()
                .orElse(null);
    }

    public Subject findBySubjectName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            Set<Subject> subjects = studentSetMap.get(a);
            for (Subject s : subjects) {
                if (s.getName().equals(name)) {
                    return s;
                }
            }
        }
        return null;
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
        Student student = college.findByAccount("00001");
        System.out.println("Найденный студент - " + student);
        Subject english = college.findBySubjectName("00001", "English");
        System.out.println("Оценка по найденному предмету - " + english.getScore());
    }
}
