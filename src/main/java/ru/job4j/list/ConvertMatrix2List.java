package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                      System.out.print(cell + " ");
                      list.add(cell);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ConvertMatrix2List array = new ConvertMatrix2List();
        array.toList(new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        }
        );
    }
}
