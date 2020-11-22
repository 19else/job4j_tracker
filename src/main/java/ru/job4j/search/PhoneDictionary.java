package ru.job4j.search;
import javax.swing.text.StringContent;
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
       for (Person person:persons) {
           if(person.getSurname().contains(key) ||
              person.getName().contains(key) ||
              person.getAddress().contains(key) ||
              person.getPhone().contains(key)) {
               result.add(person);
           }
        }

        return result;
    }
}
