package ru.job4j.excersises;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int rsl = a;
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;

        for (int i = 2; i < array.length; i++) {
            rsl = rsl + array[i-1];
            array[i] = rsl;

        }

        for (int i = 0; i < array.length ; i++) {
           System.out.println(array[i]);
        }
return array;
    }

    public static int[] calculateV2(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = a + b;

        for (int i = 2; i < array.length ; i++) {
            array[i] = sum;
            sum *= 2;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        calculate(1,2,10);
        System.out.println("==========");
        calculate(1,2, 4);
        System.out.println("==========");
        calculate(1,2,3);
        System.out.println("Version2");
        calculateV2(1, 2, 5);
    }
}
