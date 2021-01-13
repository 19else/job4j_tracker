package ru.job4j.excersises.map;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> state = new HashMap<Integer, String>();
        state.put(1, "Russia");
        state.put(2, "Poland");
        state.put(3, "Germany");
        state.put(4, "USA");
        state.put(5, "Ukraine");
       // получим объект по 2 ключу
        String first = state.get(2);
        System.out.println(first);
        //получим весь набор ключей
        Set<Integer> keys = state.keySet();
        System.out.println(keys);
        //получим весь набор значений
        Collection<String> values = state.values();
        System.out.println(values);
        //заменим элемент
        state.replace(1,"GB");
        System.out.println(values);
        //удаление элемента по ключу 2
        state.remove(2);
        //перебор элементов
        for(Map.Entry<Integer, String> item : state.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, User> clients = new HashMap<>();
        User userList = new
                User("502 420", "Elovikov Sergey");
        clients.put("123", userList);
        clients.put("789", userList);
        System.out.println(clients);
        }

    }

