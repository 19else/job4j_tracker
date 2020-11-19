package ru.job4j.excersises;

public class NonSquareArray {
    public static void main(String[] args) {
        int[][] array = new int[][] {{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].length);
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

            }

        }
    }
}
