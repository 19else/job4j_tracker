package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemTest {
    @Test
    public void CompareToUp() {
        List<Item> items = Arrays.asList(
                new Item(1, "Merkel"),
                new Item(3, "Chaves"),
                new Item(2, "Trump"),
                new Item(4, "Kennedy")
        );
        List<Item> expected = Arrays.asList(
                new Item(3, "Chaves"),
                new Item(4, "Kennedy"),
                new Item(1, "Merkel"),
                new Item(2, "Trump")
        );
        System.out.println("before: " + items);
        Collections.sort(items, new SortByName());
        System.out.println("after: " + items);
        assertThat(items, is(expected));
    }

    @Test
    public void CompareToDown() {
        List<Item> items = Arrays.asList(
                new Item(1, "Merkel"),
                new Item(3, "Chaves"),
                new Item(2, "Trump"),
                new Item(4, "Kennedy")
        );
        List<Item> expected = Arrays.asList(
                new Item(2, "Trump"),
                new Item(1, "Merkel"),
                new Item(4, "Kennedy"),
                new Item(3, "Chaves")
        );

        Collections.sort(items, new SortByNameCountdown());
        assertThat(items, is(expected));
    }
}