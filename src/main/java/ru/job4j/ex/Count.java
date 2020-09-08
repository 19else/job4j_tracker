package ru.job4j.ex;

public class Count {
    public static int add(int start, int stop) {
        if (start > stop) {
            throw new IllegalArgumentException("Start should be less then stop");
        }
        int rsl = 0;
        for (int index = start; index != stop; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + add(10,2));
    }

}
