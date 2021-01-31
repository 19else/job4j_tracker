package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public String sound() {
        String voice = "May-May";
        return voice;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void giveNik(String nik) {
        this.name = nik;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are Gav's food");
        Cat gav = new Cat();
        gav.giveNik("Gav's");
        gav.eat("kotleta");
        gav.sound();
        gav.show();
        System.out.println("There are Black's food");
        Cat black = new Cat();
        black.giveNik("Black");
        black.eat("fish");
        System.out.println(black.sound());
        black.show();
    }
}
