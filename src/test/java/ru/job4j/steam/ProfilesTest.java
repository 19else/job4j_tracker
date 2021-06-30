package ru.job4j.steam;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {

    @Test
    public void whenCollectIsTrue() {
        List<Address> addressList = List.of(
                new Address("Korolev", "Kosmonavtov", 10, 11),
                new Address("Moscow", "Krasnaya", 1, 2)
        );
        Profiles profiles = new Profiles();
        List<Profile> profileList = List.of(
                new Profile(new Address("Korolev", "Kosmonavtov", 10, 11)),
                new Profile(new Address("Moscow", "Krasnaya", 1, 2))
        );
        List<Address> rsl = profiles.collect(profileList);
        assertThat(rsl, is(addressList));
    }

    @Test
    public void deleteDuplicates() {
        List<Address> addressList = List.of(
                new Address("Korolev", "Kosmonavtov", 10, 11),
                new Address("Moscow", "Krasnaya", 1, 2)
        );
        Profiles profiles = new Profiles();
        List<Profile> compareList = List.of(
                new Profile(new Address("Moscow", "Krasnaya", 1, 2)),
                new Profile(new Address("Korolev", "Kosmonavtov", 10, 11)),
                new Profile(new Address("Moscow", "Krasnaya", 1, 2)),
                new Profile(new Address("Korolev", "Kosmonavtov", 10, 11))
        );
        List<Address> rsl = profiles.collect(compareList);
        assertThat(rsl, is(addressList));
    }

    @Test
    public void sortedByCity() {
        List<Address> addressList = List.of(
                new Address("Korolev", "Kosmonavtov", 10, 11),
                new Address("Moscow", "Krasnaya", 1, 2),
                new Address("Omsk", "Lenina", 1, 15)
        );
        Profiles profiles = new Profiles();
        List<Profile> compareList = List.of(
                new Profile(new Address("Omsk", "Lenina", 1, 15)),
                new Profile(new Address("Moscow", "Krasnaya", 1, 2)),
                new Profile(new Address("Korolev", "Kosmonavtov", 10, 11)),
                new Profile(new Address("Moscow", "Krasnaya", 1, 2)),
                new Profile(new Address("Korolev", "Kosmonavtov", 10, 11))
        );
        List<Address> rsl = profiles.collect(compareList);
        assertThat(rsl, is(addressList));
        System.out.println(rsl);
    }
}