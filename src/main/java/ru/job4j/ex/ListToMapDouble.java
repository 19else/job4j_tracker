package ru.job4j.ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

public class ListToMapDouble {
    private final String k;
    private final String v;

    public ListToMapDouble(String k, String v) {
        this.k = k;
        this.v = v;
    }

    public static void main(String[] args) throws Exception {
        List<ListToMapDouble> list = Arrays.asList(
                new ListToMapDouble("key1", "value1"),
                new ListToMapDouble("key2", "value2"),
                new ListToMapDouble("key3", "value3a"),
                new ListToMapDouble("key3", "value3b")
        );
        Collector<ListToMapDouble, ?, Map<String, String>> eloquentCollector =
                Collector.of(HashMap::new, (map, listToMapDouble)
                                -> putUnique(map, listToMapDouble.k, listToMapDouble.v),
                        (m1, m2) -> {
                            m2.forEach((k, v) -> putUnique(m1, k, v));
                            return m1;
                        });
        Map<String, String> map = list.stream()
                .collect(eloquentCollector);
        System.out.println(map);

    }

    private static <K, V> void putUnique(Map<K, V> map, K key, V v1) {
        V v2 = map.putIfAbsent(key, v1);
        if (v2 != null) throw new IllegalStateException(
                String.format("Duplicate key '%s' (attempted merging incoming value '%s' with exiting '%s')"
                        , key, v1, v2));
    }
}
