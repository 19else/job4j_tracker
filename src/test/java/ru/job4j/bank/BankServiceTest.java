package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void testAddUser() {
        User user = new User("3432", "Sergey");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3432"), is(user));
    }

    @Test
    public void whenInvalidPassport() {
        User user = new User("123", "Semen");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("456", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void findByRequisite() {
        User user = new User("123", "Tom");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("456", 150D));
        assertThat(bank.findByRequisite("123", "456").getBalance(), is(150D));
    }

    @Test
    public void whenUserNotFound() {
        User user = new User("", "NotFound");
        BankService bank = new BankService();
        assertNull(bank.findByPassport("456"));
    }
}