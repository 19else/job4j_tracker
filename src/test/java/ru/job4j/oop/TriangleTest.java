package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class    TriangleTest {

    @Test
     public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, closeTo(8, 0.001));
    }
}