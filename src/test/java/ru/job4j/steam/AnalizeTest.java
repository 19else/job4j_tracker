package ru.job4j.steam;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AnalizeTest {
@Test
    public void whenIdAndNamesNotEquals() {
        List<Analize.User> previous = List.of(
                new Analize.User(1, "Ivan"),
                new Analize.User(2, "Fedor"),
                new Analize.User(3, "Mile")
        );
        List<Analize.User> current = List.of(
                new Analize.User(4, "Nik"),
                new Analize.User(5, "Mike"),
                new Analize.User(6, "Billy"),
                new Analize.User(7, "John")
        );
        Analize analize = new Analize();
        List list = new ArrayList();
        list.add(analize.diff(previous, current));
        System.out.println(list.toString());
        }

    @Test
    public void whenIdEquals() {
        List<Analize.User> previous = List.of(
                new Analize.User(1, "Ivan"),
                new Analize.User(2, "Fedor"),
                new Analize.User(3, "Mile")
        );
        List<Analize.User> current = List.of(
                new Analize.User(1, "Nik"),
                new Analize.User(2, "Mike"),
                new Analize.User(3, "Billy")
        );
        Analize analize = new Analize();
        List list = new ArrayList();
        list.add(analize.diff(previous, current));
        Analize.Info rsl = analize.diff(previous, current);
        Analize.Info expected = new Analize.Info();
        expected.changed = 3;
        expected.deleted = 0;
        expected.added = 0;
        assertThat(rsl, is(expected));
    }
}