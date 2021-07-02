package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(p -> p.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (user != null) {
            return accounts
                    .stream()
                    .filter(r -> r.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        System.out.println("User not found");
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double ammount) {
        Account userSrc = findByRequisite(srcPassport, srcRequisite);
        Account userDest = findByRequisite(destPassport, destRequisite);
        if (userDest.getRequisite() != null && userSrc.getRequisite() != null
                && userSrc.getBalance() >= ammount) {
            userDest.setBalance(userDest.getBalance() + ammount);
            userSrc.setBalance(userSrc.getBalance() - ammount);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        String requisite = "2brgdg3";
        accountList.add(new Account("2brgdg3", 150));
        int index = accountList.indexOf(new Account(requisite, -1));
        Account find = accountList.get(index);
        System.out.println("Реквизиты: " + find.getRequisite() + " Баланс:  " + find.getBalance());
    }
}
