package ru.job4j.tracker;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {
        this.name = "Vasia";
        this.name = "Fedia";
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        this.birthday = "23 июля";
        return birthday;
    }

    public String diagnosis(String covid) {
        return covid;

    }

    public static void main(String[] args) {
        Profession engineer = new Profession();
        Profession doctor = new Profession();
        engineer.getName();
        doctor.getBirthday();
        doctor.diagnosis("virus");



    }




}
