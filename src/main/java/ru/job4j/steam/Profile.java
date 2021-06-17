package ru.job4j.steam;

import java.awt.*;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
