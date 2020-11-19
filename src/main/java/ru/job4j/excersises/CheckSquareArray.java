package ru.job4j.excersises;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        System.out.println("standard = " + standard);
        for (int i = 0; i < array.length; i++) {
            System.out.println("array I [" + i + "]");
            System.out.println("array I.length[" + array[i].length + "]");
            if( array[i].length != standard) {
                rsl = false;
                break;
            }

        }
        return rsl;
    }
    public static void main(String[] args) {
      //  checkArray(new int[][]{{1,2,3}, {4, 5, 6}, {7, 8, 9}});
        checkArray(new int[][]{{0,1,2,3}, {4, 5, 6}, {7, 8, 9}});

    }
}
