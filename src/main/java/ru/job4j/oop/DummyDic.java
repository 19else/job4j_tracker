package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
            return "Неизвестное слово - ";
    }

    public static void main(String[] args) {
        DummyDic speak = new DummyDic();
        String eng = "hello";
        System.out.println(speak.engToRus(eng) + eng);
    }
}
