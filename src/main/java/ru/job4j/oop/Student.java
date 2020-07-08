package ru.job4j.oop;

public class Student {
    public void music(String lirics) {
        System.out.println("tra-la-la" + lirics);
    }
    public void song() {
        System.out.println("I believe in love ");
    }
    public static void main(String[] args) {
        Student petia = new Student();
        String song = " : I can fly away";
            for (int index = 0; index < 3; index++) {
            petia.song();
            petia.music(song);
            }
    }
}
