package ru.job4j.excersises;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        String line = Integer.toString(i);
        int half = line.length() / 2;
        int half2 = line.length();
        for (int index = 0; index < half; index++) {
            if(line.charAt(half2 - 1 - index) != line.charAt(index)) {
                rsl = false;

            }
        }
        System.out.println(rsl);

        return rsl;
    }

    public static void main(String[] args) {
        check(1112111);
        check(123456321);
    }
}
