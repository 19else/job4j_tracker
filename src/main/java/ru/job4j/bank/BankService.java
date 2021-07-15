package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

//    public Optional<User> findByPassport(String passport) {
//        Optional<User> rsl = Optional.empty();
//        for (User user : users.keySet()) {
//            if (user.getPassport().equals(passport)) {
//                rsl = Optional.of(user);
//                break;
//            }
//        }
//        return rsl;
//    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
         rsl = users.keySet().stream()
                .filter(r -> r.getPassport().equals(passport))
                .findFirst();
        return rsl;
    }



    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            rsl = accounts.stream()
                    .filter(r -> r.getRequisite().equals(requisite))
                    .findFirst();
        } else {
            System.out.println("User not found_findByRequisite()");
        }

        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double ammount) {
        Optional<Account> userSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> userDest = findByRequisite(destPassport, destRequisite);
        if (userDest.isPresent() && userSrc.isPresent()
                && userSrc.get().getBalance() >= ammount) {
            userDest.get().setBalance(userDest.get().getBalance() + ammount);
            userSrc.get().setBalance(userSrc.get().getBalance() - ammount);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        BankService bankService = new BankService();
        bankService.addUser(new User("123456", "Billy Bones"));
        Optional<User> user = bankService.findByPassport("123456");
        if(user.isPresent()) {
            System.out.println(user.get().getUsername());
        } else {
            System.out.println("passport is not correct");
        }
        String requisite = "2brgdg3";
        accountList.add(new Account("2brgdg3", 150));
        accountList.add(new Account("abcd1234", 200));
        int index = accountList.indexOf(new Account(requisite, -1));
        Account find = accountList.get(index);
        System.out.println("Реквизиты: " + find.getRequisite() + " Баланс:  " + find.getBalance());

    }
}
