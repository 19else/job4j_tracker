package ru.job4j.excersises;

import java.util.Arrays;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length; //Длина массива
        int m = matrix[0].length; // Количество строк в массиве
        int[][] result = new int [m][n]; // создаем новый массив: количество строк m, длинной n
        System.out.println("matrix.length = " + n);
        System.out.println("matrix[0].length = " + m);
        for (int i = 0; i < n; i++) { // проходим циклом по строкам
            for (int j = 0; j < m; j++) { // по длине массива
         //    int temp = matrix[i][j]; // создаем временный контейнер для массива
         //    matrix[i][j] = matrix[j][i]; // меняем местами строка/столбец
         //    matrix[j][i] = temp;         // записываем новое значение
             result[j][i] = matrix[i][j]; // присваиваем значения массиву result значение matrix
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%2d", matrix[i][j]);
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}};
        int[][] input1 = {{1,2}, {3,4}};
        int[][] input2 = {{1,4}, {2, 5}, {3,6}};
        int[][] input3 = {{1}, {2}};
       convert(input);
        convert(input1);
     convert(input2);
        convert(input3);

    }
}
