package ru.job4j.excersises.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());
       test(listOfAnimal);
       test(listOfDog);


    }

    private static void test(List<? extends Animal> list) { // ? массив объектов - которые наследуют класс Animal
        for (Animal animal: list) { // пройтись по всем спискам класса animal
         //   System.out.println(animal);
            animal.eat();
        }
    }
}
