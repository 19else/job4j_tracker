package ru.job4j.excersises;

public class AnotherClient implements Callback {
    //реализовать интерфейс для callback()
    public void callback(int p) {
        System.out.println("Еще один метод callback(), ");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
