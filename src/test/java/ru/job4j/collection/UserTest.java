package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest  {

    @Test
    public void whenAsc() {
    Set<User> users = new TreeSet<>();
    users.add(new User("Sergey", 32));
    users.add(new User("Fedor", 31));
    Iterator<User> it = users.iterator();
    assertThat(it.next(), is(new User("Fedor", 31)));
    assertThat(it.next(), is(new User("Sergey", 32)));
    }

    @Test
    public void whenCompareSergeyVSFedor() {
    int rsl = new User("Sergey", 32).compareTo(new User("Fedor", 31)
    );
    assertThat(rsl, greaterThan(0));
    }
}