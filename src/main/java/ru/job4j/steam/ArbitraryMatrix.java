package ru.job4j.steam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArbitraryMatrix {

    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println("List<Integer> : " + matrix);
        System.out.println("flatMap by List<Integer> : "
                + matrix.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
        );
        System.out.println();
        Integer[] one = {1, 2, 3, 4};
        Integer[] two = {5, 6, 7, 8};
        List<Integer[]> oneTwo = List.of(
                one,
                two
        );
        System.out.println("Integer[] one: " + Arrays.toString(one)
                + "   Integer[] two:" + Arrays.toString(two));

        System.out.println("flatMap by List<Integer[]>:"
                + oneTwo.stream()
                .flatMap(Arrays::stream)
                .collect(Collectors.toList())
        );
        System.out.println();
        Integer[][] arrays = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Integer[][] : " + Arrays.deepToString(arrays));
        //   System.out.println("flatMap by Integer[][] : " + transform(arrays));
        System.out.println();
        //   System.out.println("flatMap by List<Integer[][]> on Stream.of : " + transformSteamOf(arrays));
        System.out.println();
        Integer[][] nums = {{1, 2}, {3, 4}};
        Integer[][] nums2 = {{1, 6}, {7, 8}};
        List<Integer[][]> matrixQuad = List.of(
                nums,
                nums2
        );
        System.out.println("Integer[][] nums : " + Arrays.deepToString(nums)
                + "  Integer[][] nums2 : " + Arrays.deepToString(nums2));
        System.out.println("List<Integer[][]> to List<Integer[]> by flatMap: "
                + Arrays.deepToString(matrixQuad.stream()
                .flatMap(Arrays::stream).toArray()));

        List<Integer[]> res = matrixQuad.stream()
                .flatMap(e -> Arrays.stream(e))
                .collect(Collectors.toList());
        System.out.println("List<Integer[]> flatMap = " + Arrays.deepToString(res.toArray()));
//        System.out.println("rsl[0] = " + Arrays.deepToString(rsl.get(0)));
//        rsl.set(0, new Integer[] {7, 8, 9, 10});
//        System.out.println("new rsl[0] = " + Arrays.deepToString(rsl.get(0)));
    }

    public List<Integer> transform(Integer[][] dim) {
        return Arrays.stream(dim)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }

    public List<Integer> transformSteamOf(Integer[][] dim) {
        return Stream.of(dim)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}

