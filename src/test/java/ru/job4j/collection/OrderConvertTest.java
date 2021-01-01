package ru.job4j.collection;


import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderConvertTest {
@Test
    public void whenSingleOrder() {
    List<Order> orders = new ArrayList<>();
    orders.add(new Order("2sfe", "Dress"));
    HashMap<String, Order> map = OrderConvert.process(orders);
    assertThat(map.get("2sfe"), is(new Order("2sfe", "Dress")));

}

}