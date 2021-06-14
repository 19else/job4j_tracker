package ru.job4j.collection;

import javax.swing.*;
import javax.swing.plaf.SeparatorUI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSorterFuncHi {
    public static void main(String[] args) {
        List<Job> jobList = Arrays.asList(
                new Job("Fix bug", 3),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0),
                new Job("X task", 1)
        );
        jobList.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println("Sort descending by Name, then Priority : "
                + System.lineSeparator() + jobList);

        Comparator<Job> compareName = Comparator.comparing(Job :: getName);
        Comparator<Job> comparePriority = Comparator.comparingInt(Job::getPriority);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);
        jobList.sort(combine);
        System.out.println("Sort Ascending by Name, then Priority : "
                + System.lineSeparator() + jobList);
    }
}
