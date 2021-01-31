package ru.job4j.tracker;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDest = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("arraySource : " + Arrays.toString(arraySource));
        System.out.println("arrayDest : " + Arrays.toString(arrayDest));
        System.arraycopy(arraySource, 0, arrayDest, 0, 3);
        System.out.println("arrayDest after copy : " + Arrays.toString(arrayDest));
        int a = 2;
        int b = 6;
        int sum = 0;
        for (int index = a; b > index; index++) {
            sum = sum + index * b;
            System.out.println(index + " A = " + " B" + b);
            System.out.println(b);

            System.out.println(sum);
        }
        System.out.println("Итоговая сумма: " + sum);
    }
}
