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
            if (!users.containsValue(accounts)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User pass : users.keySet()) {
            if (pass.getPassport().contains(passport)) {
                return pass;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            System.out.println("User not found");
            return null;
        }
        List<Account> account = users.get(user);
        for (Account req : account) {
            if (req.getRequisite().equals(requisite)) {
                return req;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double ammount) {
        Account userSrc = findByRequisite(srcPassport, srcRequisite);
        Account userDest = findByRequisite(destPassport, destRequisite);
        if (userSrc.getBalance() < ammount) {
            return false;
        }
        if(userDest.getRequisite() != null && userSrc.getRequisite() != null) {
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
