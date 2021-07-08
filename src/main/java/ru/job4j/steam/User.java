package ru.job4j.steam;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class User {
    private String name;
    private String surname;
    private byte age;
    private String login;
    private String password;
    private boolean activated;
    private String gender;

    public User() {

    }

    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String login;
        private String password;
        private boolean activated;
        private String gender;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildLogin(String login) {
            this.login = login;
            return this;
        }

        Builder buildPassword(String password) {
            this.password = password;
            return this;
        }

        Builder buildActivated(boolean activated) {
            this.activated = activated;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        User build() {
            User user = new User();
            user.name = name;
            user.gender = gender;
            user.activated = activated;
            user.password = password;
            user.login = login;
            user.age = age;
            user.surname = surname;
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", activated=" + activated +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = new Builder().buildName("Name")
                .buildActivated(true)
                .buildAge((byte) 25)
                .buildGender("male")
                .buildLogin("qwerty")
                .buildPassword("123456")
                .buildSurname("Surname")
                .build();

        User user1 = new Builder().buildName("UserTwo")
                .buildSurname("SurnameTwo")
                .buildGender("female")
                .build();
        System.out.println(user.toString());
        System.out.println(user1.toString());
    }
}


