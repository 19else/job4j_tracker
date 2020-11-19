package ru.job4j.excersises;

import jdk.jfr.Experimental;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows (int count) {
        int[][] triangle = new int[count][];
        for (int i = 1; i < triangle.length ; i++) {
            System.out.println(triangle[i].length);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int count = 3;
        int y = 1;
        int[][] rsl = new int[count][];
            for (int j = 0; j < count ; j++) {

                 rsl[j] = new int[j + 1];
                for (int i = 0; i < rsl[j].length ; i++) {
                    rsl[j][i] = y++;

                }
                System.out.println(Arrays.deepToString(rsl));


                 //   System.out.println(Arrays.toString(rsl[j]));



            }


        }
}
