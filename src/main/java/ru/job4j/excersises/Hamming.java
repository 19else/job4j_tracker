package ru.job4j.excersises;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int rsl = 0;
        for (int index = 0; index < left.length() ; index++) {
            char l = left.charAt(index);
            char r = right.charAt(index);
            if (l != r) {
                rsl++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkStrings("2173896", "2233796"));
        System.out.println(checkStrings("abcde", "bcdef"));
        System.out.println(checkStrings("abcde", "abcde"));

    }
}
