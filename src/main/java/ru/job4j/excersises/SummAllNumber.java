package ru.job4j.excersises;

public class SummAllNumber {
    public static void main(String[] args) {
       int a = 1;
       int b = 2;
        int rsl = a + b;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("rsl = " + rsl);
            System.out.println("i = " + i);
            rsl= rsl + rsl;
            System.out.println("rsl + i = " + rsl);
            System.out.println();
        }
    }
}
