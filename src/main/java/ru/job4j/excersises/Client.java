package ru.job4j.excersises;

public class Client implements Callback {
    //Реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), " + "вызываемый со значением " + p);
    }
    void nonIfaceMeth() {
        System.out.println("В классах реализующие интерфесы, "
        + " могут определяться и другие члены ");
    }
}
