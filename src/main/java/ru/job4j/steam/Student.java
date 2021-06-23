package ru.job4j.steam;

import java.util.Objects;

public class Student {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
//        Student student = (Student) obj;
//        return score == student.score
//                && Objects.equals(surname, student.surname);
        Student student = (Student) obj;
        return score == student.score
                && Objects.equals(surname, student.surname);
    }
}
