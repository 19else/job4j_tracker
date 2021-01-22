package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int left = o1.length();
        int right = o2.length();
        int min = Math.min(left, right);
        for (int i = 0; i < min; i++) {
            int rsl = Character.compare(o1.charAt(i), o2.charAt(i));
            if ( rsl != 0) return rsl;
            }
        return Integer.compare(left, right);
    }
}



//        int count = 0;
//        if (o1.length() == o2.length()) {
//            while (count < o2.length()) {
//                int comp = Character.compare(o1.charAt(count), o2.charAt(count));
//                if (comp == 0) {
//                    count++;
//                } else {
//                    return Integer.compare(o1.charAt(count), o2.charAt(count));
//                }
//            }
//        }
//        return Integer.compare(o1.length(), o2.length());
//    }

