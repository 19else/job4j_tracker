package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Factorial : " + calc(3));
    }

    public static int calc(int n) {
        int rlt = 1;
        if (n < 0) {
            throw new IllegalArgumentException("N must be > 0");
        }
        for (int index = 1; index < n ; index++) {
            rlt *= index;
        }
        return rlt;
    }
}
