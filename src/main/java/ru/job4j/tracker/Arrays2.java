package ru.job4j.tracker;
import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));

        System.arraycopy(array, 0, array, 3, 3);
        System.out.println(Arrays.toString(array));
    }
}
