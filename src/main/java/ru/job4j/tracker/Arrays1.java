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
    }
}
