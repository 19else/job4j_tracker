package ru.job4j.collection;

import javax.swing.text.StringContent;
import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Nik");
        names.add("Floyd");
        for (Object value : names) {
            if (value.equals("Peter")) {
                System.out.println("value");
            }
            if (names.contains("Nik")) {
                System.out.println("Nik_content");
                break;
            }
        }
    }
}
