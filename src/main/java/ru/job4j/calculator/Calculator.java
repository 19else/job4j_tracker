package ru.job4j.calculator;

public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        double temp = add(second, third);
        return add(first, temp);
    }

}
