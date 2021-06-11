package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaFunc {

    public List<Double> range(int start, int end, Function<Double, Double> func) {
        List<Double> rls = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rls.add(func.apply((double) i));
        }
        return rls;
    }
}



