package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class JobTest {
@Test
    public void whenComparatorByNameAndPriority() {
    Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
    int rsl =cmpNamePriority.compare(
            new Job("TheLongName", 0),
            new Job("ShortName", 1)
    );
    assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
    Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
    int rsl = cmpNamePriority.compare(
            new Job("TheLongName", 1),
            new Job("ShortName", 0)

    );
    assertThat(rsl, is(1));
    }
    @Test
    public void ComparatorJobAscByName() {
    Comparator<Job> ascByName = new JobAscByName();
        List<Job> ascName = Arrays.asList(
                new Job("TheLongName", 3),
                new Job("MiddleName", 2)
        );
        List<Job> ascName2 = Arrays.asList(
                new Job("SecondLongName", 2),
                new Job("SecondMiddleName", 4),
                new Job("SecShortName",1)
        );
    int rsl = ascByName.compare(
            new Job("TheLongName", 3),
            new Job("MiddleName", 2)

    );
    Collections.sort(ascName);
        System.out.println(rsl);
        System.out.println(ascByName);
    assertThat(rsl, is(ascName));
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
}