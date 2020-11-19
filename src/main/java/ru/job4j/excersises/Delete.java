package ru.job4j.excersises;

public class Delete {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        person.setName("123");
        person1.setName("two");
        System.out.println(person.getName());
        System.out.println(person1.getName());
        Person.countPeople();
        person.countPlus();
    }

}
class Person {
    private String name;
    public static int count;

    public void setName(String username) {
        name = username;
        count++;
    }

    public String getName() {
        if (name.isEmpty()) {
            System.out.println("Enter name");
        } else {
           return name;
        }
        return name;

    }

    public static void countPeople(){
        System.out.println("всего сотрудников " + count);

    }
     void countPlus() {
         name = "void";
         System.out.println(name);;

    }
}


