package ru.job4j.ex;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class CountTest {

    @Test (expected = IllegalArgumentException.class)
    public void whenStartGreaterStop() {
        Count.add(10, 2);
    }

    @Test
    public void when0then3() {
        int rsl = Count.add(0, 3);
        Assert.assertThat(rsl, is(3));
    }
}