package ru.job4j.excersises;

public class Cryptography {
    public static String code(String s) {
        char xx = '#';
        StringBuilder stringBuilder = new StringBuilder(s);
        int l = s.length() - 4;
        for (int i = 0; i < l ; i++) {
            stringBuilder.setCharAt(i, xx);
        }
        System.out.println(stringBuilder.toString());

        if (s.equals("")) {
            System.out.println("Empty");;
        }
        return s;
    }

    public static void main(String[] args) {
        code("4556364607935616");
        System.out.println();
        code("");
        System.out.println();
        code("12345");

    }
}
