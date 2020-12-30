package ru.job4j.collection;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class PassportOfficeTest {
@Test
    public void testAdd() {
    Citizen citizen = new Citizen("ab 123", "Sergey Elovikov");
    PassportOffice passportOffice = new PassportOffice();
    passportOffice.add(citizen);
    assertThat(passportOffice.get(citizen.getPassport()), is(citizen));
    }
    @Test
    public void whenReturnNull() {
        Citizen citizen = new Citizen("ab 123", "Sergey Elovikov");
        PassportOffice passportOffice = new PassportOffice();
        passportOffice.add(citizen);
        assertNull(passportOffice.get("ab 456"));
    }
}