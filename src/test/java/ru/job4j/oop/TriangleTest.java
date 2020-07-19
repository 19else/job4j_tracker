package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
     public void Period() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, closeTo(2, 0.001));
    }
}