package ru.job4j.excersises;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);

        Client b = new Client();
        b.nonIfaceMeth();
    }
}
