package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
        new Job("HiPriority", 1),
                new Job("TheSameName", 2),
                new Job("Very long name", 3),
                new Job("ShortName", 4),
                new Job("TheSameName", 5),
                new Job("TheSameName", 6)
        );
        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, comb);
        //Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
    }
}
