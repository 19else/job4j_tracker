package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 10),
                new Attachment("image 2", 120),
                new Attachment("image 3", 20)
        };
        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare - " + left.getSize() + " : " + right.getSize());
            return left.getSize() - right.getSize();
        };
        Arrays.sort(attachments, comparator);
        System.out.println(Arrays.toString(attachments));
    }
}
