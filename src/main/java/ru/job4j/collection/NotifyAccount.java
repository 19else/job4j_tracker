package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account passportNumber : accounts) {
            rsl.add(passportNumber);
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Ivanov", "01"),
                new Account("456", "Petroff", "02"),
                new Account("789", "Sidoroff", "03"),
                new Account("123", "Duplicatoff", "04"),
                new Account("456", "Petroff_duble", "05")
        );
        System.out.println(sent(accounts));
    }
}
