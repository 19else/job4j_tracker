package ru.job4j.search;

import javax.swing.text.StringContent;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList<Person> find(String key) {
        Predicate<Person> phone = check -> check.getPhone().contains(key);
        Predicate<Person> address = check -> check.getAddress().contains(key);
        Predicate<Person> name = check -> check.getName().contains(key);
        Predicate<Person> surname = check -> check.getSurname().contains(key);
        Predicate<Person> combination = phone.or(address).or(name).or(surname);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combination.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}


