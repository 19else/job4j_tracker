package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        /* Создаем класс объекта Car */
        Car car = new Car();
        /* Приводим к типу родителя Transport */
        Transport tp = car;
        /* Приводим к типу родителя Object*/
        Object obj = car;
        /*Приведение типа при создании объекта */
        Object ocar = new Car();
        /*Приведение типа за счет повышения иерархии*/
        Car carFromObject = (Car) ocar;
        //   /*Ошибка приведения типа*/
        // Object bicycle = new Bicycle();
        //  Transport bicycle1 = (Bicycle) bicycle;
        // код завершится ошибкой приведения типов ClassCastException
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
