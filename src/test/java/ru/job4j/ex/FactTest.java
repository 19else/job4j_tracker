package ru.job4j.ex;

import junit.framework.TestCase;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class FactTest  {

        @Test (expected = IllegalArgumentException.class)
        public void whenNLessThen0() {
            int rsl = Fact.calc(-1);
            Assert.assertThat(rsl, Is.is(0));

    }
    @Test
    public void whenNGreaterThen0() {
            int rsl = Fact.calc(3);
            Assert.assertThat(rsl, Is.is(2));
    }
}