package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PassportOfficeTest {
@Test
    public void testAdd() {
    Citizen citizen = new Citizen("ab 123", "Sergey Elovikov");
    PassportOffice passportOffice = new PassportOffice();
    passportOffice.add(citizen);
    assertThat(passportOffice.get(citizen.getPassport()), is(citizen));
    }
}