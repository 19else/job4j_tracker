package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 80);
        Product bread = new Product("Масло", 120);
        Product eggs = new Product("Яйца", 250);
        Product[] prods = new Product[3];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = eggs;
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods [index];
            System.out.println(pr.getName() + " - " + pr.getCount() + " руб");
        }
        System.out.println("Заменим молоко на растительное масло");
        Product oil = new Product("Растительное масло", 50);
        prods[0] = oil;
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount() + " руб");
        }
        System.out.println("Выведем только продукты дороже 80 рублей");
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if(pr.getCount() > 80) {
                System.out.println(pr.getName() + " - " + pr.getCount() + " руб");
            }
        }
    }
}
