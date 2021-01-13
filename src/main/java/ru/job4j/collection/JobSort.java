package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSort {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Check engine", 1),
                new Job("Check Oil", 3),
                new Job("Check coolant", 2)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println("SortByName: " + jobs);
    }
}
