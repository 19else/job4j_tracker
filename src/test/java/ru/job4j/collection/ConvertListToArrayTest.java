package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;

public class ConvertListToArrayTest {
@Test
    public void when7ElementsThen9() {
        ConvertListToArray list = new ConvertListToArray();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
    Assert.assertThat(result, is(expect));
    }
}