package ru.job4j.search;

import junit.framework.TestCase;
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
       phones.add(
                new Person("Donald", "Tramp", "00000", "11111")
        );
        ArrayList<Person> persons = phones.find("Petr");
        ArrayList<Person> persons2 = phones.find("Donald");
        Assert.assertThat(persons.get(0).getSurname(), is("Arsentev"));
        Assert.assertThat(persons2.get(2).getSurname(), is("Trump"));
    }

}