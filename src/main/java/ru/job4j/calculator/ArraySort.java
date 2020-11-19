package ru.job4j.calculator;

public class ArraySort {
   /** public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int index = 0; index < left.length ; index++) {
            rsl[index] = left [index];
            count++;
        }
        for (int index = 0; index < right.length ; index++) {
            rsl[count++] = right[index];
        }
      for (int index = 0; index < rsl.length - 1 ; index++) {
           if (rsl[index] > rsl[index + 1]) {
               int tmp = rsl [index + 1];
               rsl[index + 1] = rsl [index];
               rsl[index] = tmp;
           }


      }

        return rsl;
    } **/

   public static int getMaxValue(int[] array) {
       if (array[0] > array[array.length - 1]) {
           return array[0];
       } else { return array[array.length - 1]; }
   }
    public static int getIndexMax(int[] array) {

      // if (array[0] > array[array.length - 1]) {

            int rsl = array[0] > array[array.length - 1] ? 0 : array.length - 1;

    //    }
        return rsl;

    }

   /** public static int mult(int a, int b) {
       int sum = a;

        for (int index = a; b > index; index++) {
            System.out.println("index = " + index);
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            System.out.println((sum = a * index * b) + " = result ");

        }
        return sum;
    } **/
   public static int calculate(int a, int n) {
       int rsl = a;
       for (int index = 1; n > index; index++) {

           rsl =  rsl * a;
           System.out.println( rsl + " * " +   a + "=" + rsl);

       }
       return rsl;
   }

    public static void out(int n) {

        for (int index = 1; index <= n ; index++) {
            if (n % index == 0) {
                System.out.println(index);

            }
         //   System.out.println("Счетчик: " + index);

        }
    }
    public static int mod(int n, int d) {
       int q;
       int r;
        System.out.println("q = n / d " + (q = n / d));
        System.out.println(" d * q = " + d * q);
        System.out.println(" r = " + (r = n - d*q));
        System.out.println("Check: " + (d * q + r));


        return r;
    }



    public static void main(String[] args) {
       /** int[][] array = new int[][] {{1, 2}, { 3, 4}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);

            }
        } **/
        /**mult(0, 2);
        System.out.println();
        mult(1,2);
        System.out.println();
        mult(1,5); **/

       /** System.out.println(calculate(2, 2));
        System.out.println();
        System.out.println(calculate(3, 2));
        System.out.println();
        System.out.println(calculate(3, 1));
        System.out.println();
        System.out.println(calculate(2, 7)); **/

       //out(2);
        System.out.println("Остаток: " + mod(78, 33));
        System.out.println();
        System.out.println("Остаток: " + mod(4, 2));

   }


        }





