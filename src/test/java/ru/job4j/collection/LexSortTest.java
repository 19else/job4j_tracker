package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum5and6and15() {
        String[] input = {
                "5. Task.",
                "15. Task.",
                "6. Task."
        };
        String[] out = {
                "5. Task.",
                "6. Task.",
                "15. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

}