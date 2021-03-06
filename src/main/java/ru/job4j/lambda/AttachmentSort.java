package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        Comparator<Attachment> comparator = new Comparator<>()  {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getSize() - o2.getSize();
            }
//            @Override
//            public int compare(Object o1, Object o2) {
//                Attachment left = (Attachment) o1;
//                Attachment right = (Attachment) o2;
//                return left.getSize() - right.getSize();

        };
        attachments.sort(comparator);
        System.out.println("SortBySize = " + attachments);

        Comparator<Attachment> comparatorByName = (o1, o2) -> {
            Attachment left = (Attachment) o1;
            Attachment right = (Attachment) o2;
            return left.getName().compareTo(right.getName());
        };
        attachments.sort(comparatorByName);
        System.out.println("sortByName = " + attachments);
    }
}
