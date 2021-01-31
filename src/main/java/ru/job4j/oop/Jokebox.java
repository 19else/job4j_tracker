package ru.job4j.oop;

public class Jokebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else {
            if (position == 2) {
                System.out.println("Спокойной ночи");
            } else {
                System.out.println("Песня не найдена");
            }
        }
    }

    public static void main(String[] args) {
        Jokebox play = new Jokebox();
        play.music(1);
        play.music(2);
        play.music(3);
    }
}
