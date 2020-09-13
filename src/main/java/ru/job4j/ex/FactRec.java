package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        if (n == 0 | n == 1) {
            return n = 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int rst = calc(3);
        System.out.println(rst);
    }
}
