package ru.job4j.collection;

import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        String[] originText = origin.toLowerCase().split("[!,.; ]");
        String[] lineText = line.toLowerCase().split("\\!|\\,|\\.|\\;| ");
        HashSet<String> checker = new HashSet<>();
        for (String oneWord : originText) {
            checker.add(oneWord);
        }
        for (String lineCheck : lineText) {
            if (!checker.contains(lineCheck)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
