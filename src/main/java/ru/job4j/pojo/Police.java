package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Sergey Elovikov");
        license.setCode("A001AA");
        license.setModel("Nissan");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + "has a car - " + license.getModel() + " : " + license.getCode());
    }
}