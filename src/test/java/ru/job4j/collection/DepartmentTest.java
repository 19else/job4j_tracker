package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentTest {

    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1", "k2/sk2");
        List<String> expected = List.of("k1", "k1/sk1", "k2", "k2/sk2");
        List<String> result = Department.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenNotChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expected = List.of("k1", "k1/sk1");
        List<String> result = Department.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void sortAsc() {
        List<String> input = Arrays.asList(
                "K1/SK1",
                "K1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        List<String> expected = List.of(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        Department.sortAsc(input);
        assertThat(input, is(expected));
    }

    @Test
    public void sortDesc() {
        List<String> input = Arrays.asList(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        List<String> expected = List.of(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2"
        );
        Department.sortDesc(input);
        assertThat(input, is(expected));
    }
}