package ru.job4j.tracker;

public class Engeneer extends Profession {
    public String programmer() {
        return "write a code";
    }

    public String builder() {
        return "builds houses";
    }

    public static void main(String[] args) {
        Engeneer engeneer = new Engeneer();
        engeneer.programmer();

    }
}
