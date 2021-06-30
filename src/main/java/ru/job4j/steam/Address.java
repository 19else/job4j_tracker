package ru.job4j.steam;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Address address = (Address) obj;

        return home == address.home
                && Objects.equals(apartment, address.apartment)
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }

    @Override
    public String toString() {
        return String.format("Address: {City: %s  Street: %s Home %d Apartment %d", city, street, home, apartment);
    }
}
