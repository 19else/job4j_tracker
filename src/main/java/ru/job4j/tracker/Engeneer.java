package ru.job4j.tracker;

public class Engeneer extends Profession {
    public String programmer() {
        return "Write a code";
    }

    public String builder() {
        return "Builds houses";
    }

    public static void main(String[] args) {
        Engeneer engeneer = new Engeneer();
        engeneer.programmer();
        engeneer.builder();
    }
}
