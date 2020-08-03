package ru.job4j.pojo;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("Pepsi", 100);
        Product second = new Product("Pepsi", 100);
        boolean eq = first.equals(second);
        System.out.println(eq);
    }

}
