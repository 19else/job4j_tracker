package ru.job4j.tracker;

    public class Doctor extends Profession {

        public String dantist() {
            return "Health teeth!";
        }

        public String surgion() {
            return "Makes surgical operations!";
        }

        public static void main(String[] args) {
            Doctor doctor = new Doctor();
            System.out.println(doctor.dantist());
            System.out.println(doctor.surgion());
        }
    }
