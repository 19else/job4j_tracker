package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaFuncTest {

    @Test
    public void whenLinearFunctionThenLinearResult() {
        LambdaFunc lambdaFunc = new LambdaFunc();
        List<Double> rsl = lambdaFunc.range(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenQuadFunctionThenQuadResult() {
        LambdaFunc lambdaFunc = new LambdaFunc();
        List<Double> rsl = lambdaFunc.range(5, 8, x -> 2 * (x * x) + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResult() {
        LambdaFunc lambdaFunc = new LambdaFunc();
        List<Double> rsl = lambdaFunc.range(5, 8, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(33D, 65D, 129D);
        assertThat(rsl, is(expected));
    }
}