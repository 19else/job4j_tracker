package ru.job4j.excersises;

public class SelectionCount {
    public static int count(int length, int section) {
        int rsl = 0;
        int step;
        while (length >= section) {

            step = length - section;
            rsl ++;

            length -= section;

        }

        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(count(1, 1));
        System.out.println(count(2, 1));
        System.out.println(count(3, 2));
        System.out.println(count(4, 2));
    }
}
