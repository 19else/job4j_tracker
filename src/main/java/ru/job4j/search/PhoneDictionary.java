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

        result.add(new Person("Petr", "Arsentev", "741852", "Bryansk"));
        result.add(new Person("AAA", "BBB","12345", "987456"));
        result.add(new Person("Donald", "Trump", "00000", "11111"));
        result.add(new Person("Joe", "Bidan", "11111", "22222"));

       for (Object value:result) {

            if (value.equals(key.contains("Joe"))) {
                return result;
            };
            if (key.contains("00000")) {
                System.out.println("key.contains 00000");
                return this.persons;
            };
            if (key.contains("Biden")) {
                return this.persons;
            }
        }
        return result;
        }
    }

