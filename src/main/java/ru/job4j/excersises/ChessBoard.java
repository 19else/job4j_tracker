package ru.job4j.excersises;

import java.util.Arrays;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if(x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        if (rsl == 0) {
            System.out.println("Ладья может ходить только по горизонтали или вертикали");
            return 0;
        }
        return rsl;
    }

    public static int[] wayRook(int x1, int y1, int x2, int y2) {
        int[] rsl = new int[] {0,0};
          if(!diagonal(x1, y1, x2, y2)) {return rsl;};
           rsl  = new int[]{(x2 - x1), (y2 - y1)};

            System.out.println("Перемещение на " + Arrays.toString(rsl) + "  клеток");

        return rsl;
    }

    public static boolean diagonal(int x1, int y1, int x2, int y2) {
        boolean rsl = true;
        if (x1 == x2 || y1 == y2) {
            System.out.println("Выполнен ход не по диагонали");
            rsl = false;
        }
         return rsl;
    }

    public static void main(String[] args) {
      //  System.out.println(way(1, 1, 1, 5));
       // way(5,0,2,0);
        System.out.println(Arrays.toString(wayRook(6, 7, 1, 2)));
        System.out.println(Arrays.toString(wayRook(2, 2, 3, 1)));

    }
}
