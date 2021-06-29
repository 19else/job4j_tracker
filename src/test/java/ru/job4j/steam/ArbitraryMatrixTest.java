package ru.job4j.steam;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArbitraryMatrixTest {

    @Test
     public void testTransform() {
        Integer[][] dim = {{1,2}, {3, 4, 5}, {6}, {7, 8, 9}};
        ArbitraryMatrix arbitraryMatrix = new ArbitraryMatrix();
        List<Integer> rls = arbitraryMatrix.transform(dim);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(rls, is(expected));
    }

    @Test
    public void testTransformSteamOf() {
        Integer[][] dim = {{1,2}, {3, 4, 5}, {6}, {7, 8, 9}};
        ArbitraryMatrix arbitraryMatrix = new ArbitraryMatrix();
        List<Integer> rls = arbitraryMatrix.transformSteamOf(dim);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(rls, is(expected));
    }
}