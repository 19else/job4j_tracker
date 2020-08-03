package ru.job4j.pojo;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ShopTest  {
    @Test
    public void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Beer", 100);
        products[1] = new Product("Wine", 150);
        products[2] = new Product("Whiskey", 300);
        int rlt = Shop.indexOfNull(products);
        assertThat(rlt, is(3));
    }

    @Test
    public void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Rome", 400);
        int rst = Shop.indexOfNull(products);
        assertThat(rst, is(0));
    }

    @Test
    public void whenHasNotNull() {
        Product[] products = new Product[1];
        products[0] = new Product("Vodka", 200);
        int rst = Shop.indexOfNull(products);
        assertThat(rst, is(-1));
    }
}