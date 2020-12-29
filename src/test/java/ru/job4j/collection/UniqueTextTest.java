package ru.job4j.collection;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class UniqueTextTest {
@Test
    public void testIsEquals() {
    String origin = "My cat eats a mouse and milk";
    String text = "My cat eats milk and a mouse";
    assertThat(UniqueText.isEquals(origin, text), is (true));
    }
   @Test
    public void testIsNotEquals() {
    String origin = "My cat eats a mouse";
    String text = "A mouse is eating by a cat";
    assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}