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

    public class Doctor extends Profession {
        public String dantist () {
            return "Will heal teeth";
        }
        public String sergion() {
            return "Will heal the leg";
        }
    }

    public class Engeneer extends Profession{
        public String programmer() {
            return "write a code";
        }
        public String builder() {
            return "builds houses";
        }
    }

    public static void main(String[] args) {
        Profession engin = new Profession();
        Profession doc = new Profession();
        Engeneer engeneer = new Engeneer();
        Doctor doctor = new Doctor();
        engeneer.programmer();
        doctor.sergion();
        System.out.println(doctor.dantist());
        System.out.println(engeneer.builder());
        System.out.println(engin.getName());
        System.out.println(doc.getBirthday());
    }
}
