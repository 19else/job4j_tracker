package ru.job4j.excersises;

public class Abbreviation {
    public static String collect(String s) {
        String[] arrayS = s.split(" ");
        StringBuilder sb = new StringBuilder();
      //  String rsl = sb.toString();
        for (int index = 0; index < arrayS.length ; index++) {
          sb.append(arrayS[index].charAt(0));
      //    rsl = sb.toString();
        }
      return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(collect("Hello world peace"));
        System.out.println(collect("Peace of War, God of War"));
    }

}
