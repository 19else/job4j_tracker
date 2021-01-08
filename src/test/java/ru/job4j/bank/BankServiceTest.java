package ru.job4j.bank;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BankServiceTest {
@Test
    public void testAddUser() {
    User user = new User("3432", "Sergey");
    BankService bank = new BankService();
    bank.addUser(user);
    assertThat(bank.findByPassport("3432"), is(user));
    }
@Test
    public void WhenInvalidPassport() {
    User user = new User("123", "Semen");
    BankService bank = new BankService();
    bank.addUser(user);
    bank.addAccount(user.getPassport(), new Account("456", 150D));
    assertNull(bank.findByRequisite("34", "5546"));
    }
    @Test
    public void addAccount() {
    User user = new User("123", "Tom");
    BankService bank = new BankService();
    bank.addUser(user);
    bank.addAccount(user.getPassport(), new Account("456", 150D));
    assertThat(bank.findByRequisite("123", "456").getBalance(), is(150D));
    }

}