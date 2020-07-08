package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("tra-la-la");
    }
    public void song() {
        System.out.println("I believe in love ");
    }
    public static void main(String[] args) {
        Student petia = new Student();
            for (int index = 0; index < 3; index++) {
            petia.song();
            petia.music();
            }
    }
}
