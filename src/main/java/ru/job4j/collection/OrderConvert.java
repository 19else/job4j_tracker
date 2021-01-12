package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderConvert {

    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order list : orders) {
            map.put(list.getNumber(), list);
        }
        return map;
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("001", "Cup"));
        orders.add(new Order("002", "Bag"));
        orders.add(new Order("003", "Gap"));
        System.out.println(process(orders));

    }
}
