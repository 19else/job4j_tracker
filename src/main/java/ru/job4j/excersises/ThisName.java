package ru.job4j.excersises;

public class ThisName {
    String name;

    public String firstName(String name) {
        this.name = name;
        return name;
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThisName thisName = new ThisName();
        thisName.firstName("Privet");
        thisName.printName();
    }
}
