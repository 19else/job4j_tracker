package ru.job4j.excersises;

public class MathAbsUsage {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int rsl = j - i;
        System.out.println("Разность чисел j и i = " + rsl);
        int abs = Math.abs(rsl);
        System.out.println("Абсолютная разность чисел j и i = " + abs);
    }
}
