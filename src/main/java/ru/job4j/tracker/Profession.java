package ru.job4j.tracker;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {
        this.name = "Vasiy";
        this.name = "Fedor";
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        this.birthday = "23 июля";
        return birthday;
    }

    public static void main(String[] args) {
        Profession engin = new Profession();
        Profession doc = new Profession();
        Engeneer engeneer = new Engeneer();
        Doctor doctor = new Doctor();
        engeneer.programmer();
        System.out.println(doctor.dantist());
        System.out.println(engeneer.builder());
        System.out.println(engin.getName());
        System.out.println(doc.getBirthday());
    }
}
