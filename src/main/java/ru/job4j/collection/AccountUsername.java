package ru.job4j.collection;

import java.util.Objects;

public class AccountUsername {
    private String passport;
    private String username;
    private String deposit;

    AccountUsername(String username, String passport, String deposit) {
        this.username = username;
        this.passport = passport;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountUsername accountUsername = (AccountUsername) o;
        return Objects.equals(username, accountUsername.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);

    }

    @Override
    public String toString() {
        return "AccountUsername{" +
                "passport='" + passport + '\'' +
                ", username='" + username + '\'' +
                ", deposit='" + deposit + '\'' +
                '}';
    }
}


