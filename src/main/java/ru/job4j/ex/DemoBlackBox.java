package ru.job4j.ex;

public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox obj1 = new BlackBox(30, 5);
        BlackBox obj2 = new BlackBox(30, 5);
        System.out.println("obj3.equals(obj2) = " + true);
        // obj1.equals(obj2) должно быть true, поскольку содержимое объектов эквивалентно
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
        System.out.println("obj3.equals(obj1) = " + obj2.equals(obj1));
        System.out.println(" obj1.hashCode() = " + obj1.hashCode());
        System.out.println(" obj2.hashCode() = " + obj2.hashCode());
    }
}
