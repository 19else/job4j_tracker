package ru.job4j.collection;


import java.util.Collections;
import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        SortByNameUser rlsName = new SortByNameUser();
        int rslAge = Integer.compare(age, o.getAge());
        if(o.getName().equals(new SortByNameUser())){
             return rslAge;
        } else
      return rlsName.compare(o.getName(), this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
