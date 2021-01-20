package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl Task", 0),
                new Job("Fix Bug", 1)
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityTwo() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Bob", 1),
                new Job("Bob", 0)
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("TheLongName", 1),
                new Job("ShortName", 0)

        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void ComparatorJobAscByName() {
        Comparator<Job> ascByName = new JobAscByName();
        int rsl = ascByName.compare(
                new Job("TheLongName", 3),
                new Job("MiddleName", 2)

        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void ComparatorJobAscByPriority() {
        Comparator<Job> ascPriority = new JobAscByPriority();
        List<Job> priority = Arrays.asList(
                new Job("A", 4),
                new Job("B", 3),
                new Job("C", 2),
                new Job("D", 1)
        );
        System.out.println(priority);
        Collections.sort(priority, ascPriority);
        System.out.println("after " + priority);
    }

    @Test
    public void ComparatorJobAscByPriorityTwo() {
        Comparator<Job> ascPriority = new JobAscByPriority();
        int rsl = ascPriority.compare(
                new Job("A", 3),
                new Job("B", 6)
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }
}