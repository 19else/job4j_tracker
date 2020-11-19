package ru.job4j.excersises;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            System.out.println("num start = " + num);
            int lastDig = num % 10; // отделяем последнее число от значения num
            System.out.println("lasrDig = " + lastDig);
            sum += lastDig; // запись в sum полученное число с прибавлением предыдщего записанного числа
            System.out.println("sum = " + sum);
            num /= 10;
            System.out.println("Новое значение num / 10 = " + num);
            System.out.println();
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Result " + sum(123));
        System.out.println("check^ " + 1254 % 10);
    }
}