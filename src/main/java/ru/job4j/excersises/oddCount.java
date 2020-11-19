package ru.job4j.excersises;

public class oddCount {
    public static int count (int a, int b) {
        int rsl = 0;
        for (int index = a; index <= b ; index++) {
            if ( index % 2 == 1) {
                rsl++;
            }

        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(count(1,2));
        System.out.println(count(1,3));
        System.out.println(count(1,4));
        System.out.println(count(1,5));
    }
}
