package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        String[] originText = origin.toLowerCase().split("[!,.; ]");
        String[] lineText = line.toLowerCase().split("[!,.; ]");
        HashSet<String> checker = new HashSet<>();
        Collections.addAll(checker, originText);
        for (String lineCheck : lineText) {
            if (!checker.contains(lineCheck)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean generateBy2(String origin, String line) {
        boolean result = true;
        HashSet<String> check = new HashSet<>();
        //убираем знаки препинания
        String lowCaseOrigin = origin.toLowerCase().replaceAll("\\p{P}", "");
        String lowCaseLine = line.toLowerCase().replaceAll("\\p{P}", "");
        String[] source = lowCaseOrigin.split(" ");
        String[] lineArr = lowCaseLine.split(" ");
        Collections.addAll(check, source);
        for (String compare : lineArr) {
            if (!check.contains(compare)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateBy2("Мама мыла раму", "рамУ мыла"));
    }
}
