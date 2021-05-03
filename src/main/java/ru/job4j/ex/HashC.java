package ru.job4j.ex;

import ru.job4j.oop.Object;

public class HashC {
    // хеш-код — это число.
    // Если более точно, то это битовая строка фиксированной длины,
    // полученная из массива произвольной длины
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        //В java она представлена в виде числа примитивного типа int,
        // который равен 4-м байтам, и может помещать числа
        // от -2 147 483 648 до 2 147 483 647
        hCode = object.hashCode();
        //Это число и есть наша битовая строка фиксированной длины
        System.out.println("hCode = " + hCode);
    }
}
