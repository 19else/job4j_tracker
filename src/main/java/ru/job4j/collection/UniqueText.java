package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rlt = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, origin);
        for (String word : text) {
                if (!check.contains(word)) {
                    rlt = false;
                    break;
                }
        }
        return rlt;
    }

    public static void main(String[] args) {
        String origin = "My cat eats a mouse";
        System.out.println(origin.toLowerCase());
        String text = "my cat eats a mouse";
        String[] extra = origin.split(" ");
        String[] text2 = text.split(" ");
        boolean rsl = true;
        HashSet<String> check = new HashSet<>(Arrays.asList(extra));
        for (String checkWord:text2) {
            if (!check.contains(checkWord)) {
                rsl = false;
                break;
            }
        }
        System.out.println(rsl);
    }
}
