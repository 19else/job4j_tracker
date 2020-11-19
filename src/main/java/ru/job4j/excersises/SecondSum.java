package ru.job4j.excersises;

public class SecondSum {
    public static int sum(int a, int b) {
        int rsl = 0;
        for (int index = a; index <= b ; index += 2) {
            System.out.println("Index " + index );
            rsl += index;


        }
        return rsl;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 4));
        System.out.println(sum(1, 5));
        System.out.println(sum(0, 6));
    }
}
