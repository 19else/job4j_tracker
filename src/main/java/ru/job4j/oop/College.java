package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Students st = freshman;
        Object obj = freshman;
        Object oFresh = new Freshman();
        Freshman freshFromObj = (Freshman) oFresh;
        System.out.println(freshFromObj);
    }
}
