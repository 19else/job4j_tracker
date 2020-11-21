package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "741852", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        Assert.assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}