package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "741852", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        Assert.assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByNameByPredict() {
        var phone = new PhoneDictionary();
        phone.add(
                new Person("Sergey", "Elovikov", "1234567", "Korolev")
        );
        ArrayList<Person> persons = phone.find("Sergey");
        Assert.assertThat(persons.get(0).getSurname(), is("Elovikov"));
    }

    @Test
    public void whenFindByPhone() {
        var phone = new PhoneDictionary();
        phone.add(
                new Person("Sergey", "Elovikov", "1234567", "Korolev")
        );
        ArrayList<Person> persons = phone.find("Elovikov");
        Assert.assertThat(persons.get(0).getPhone(), is("1234567"));
    }
}