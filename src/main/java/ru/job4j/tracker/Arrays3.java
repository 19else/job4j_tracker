package ru.job4j.tracker;
import java.lang.*;

public class Arrays3 {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] d = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] sourceArr;
        int sourcePos;
        int[] destArr;
        int destPos;
        int len;
        sourceArr = s;
        sourcePos = 3;
        destArr = d;
        destPos = 5;
        len = 4;
        System.out.print("source array : ");
        for (int index = 0; index < s.length; index++) {
            System.out.print(s[index] + " ");
        }
        System.out.println("");
            System.out.println("source position : " + sourcePos);
            System.out.print("destination array : ");
            for (int i = 0; i < d.length; i++) {
                System.out.print(d[i] + " ");
            }
        System.out.println("");
                System.out.println("destPos : " + destPos);
                System.out.println("Length : " + len);
                // Use arraycopy
                System.arraycopy(sourceArr, sourcePos, destArr, destPos, len);
        System.out.print("Print final dist_array : ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
     }
}





