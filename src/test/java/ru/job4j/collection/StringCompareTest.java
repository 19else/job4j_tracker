package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StringCompareTest {
    @Test
    public void whenStringAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        System.out.println(rsl);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenLeftLessThenRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Petrov",
                "Petrova"
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Sidoroff",
                "Petrov"
        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSecondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Petrov",
                "Patrov"
        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSecondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Patrova",
                "Petrova"
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenLeftGreaterRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Велосипед",
                "Як"
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenLeftEmptyShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "",
                "NonEmpty"
        );
        System.out.println(rsl);
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenRightEmptyShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "NonEmpty",
                ""
        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenRightAndLeftSetNumberShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "12",
                "1"
        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }
}