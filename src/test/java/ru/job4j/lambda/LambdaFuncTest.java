package ru.job4j.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaFuncTest {
    public static List<Double> range(int start, int end, Function<Double, Double> func) {
        List<Double> rls = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rls.add(func.apply((double) i));
        }
        return rls;
    }

@Test
    public void whenLinearFunctionThenLinearResult() {
    List<Double> rsl = range(5, 8, x -> 2 * x + 1);
 List<Double> expected = Arrays.asList(11D, 13D, 15D);
 assertThat(rsl, is(expected));
    }

    @Test
    public void whenQuadFunctionThenQuadResult() {
        List<Double> rsl = range(5, 8, x -> 2 * (x * x) + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResult() {
        List<Double> rsl = range(5, 8, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(33D, 65D, 129D);
        assertThat(rsl, is(expected));
    }
}