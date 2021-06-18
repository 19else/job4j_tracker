package ru.job4j.steam;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {

    @Test
    public void whenCollectIsTrue() {
        List<Address> addressList = List.of(
                new Address("moscow", "krasnaya", 1, 2),
                new Address("Korolev", "Kosmonavtov", 10, 11)
        );
        Profiles profiles = new Profiles();
        List<Profile> profileList = List.of(
                new Profile(new Address("moscow", "krasnaya", 1, 2)),
                new Profile(new Address("Korolev", "Kosmonavtov", 10, 11))
        );
        List<Address> rsl = profiles.collect(profileList);
        assertThat(rsl, is(addressList));
    }
//
//    @Test
//    public void whenCollectIsFalse() {
//        List<Address> profile = List.of(
//                new Address("moscow", "krasnaya", 1, 2),
//                new Address("Korolev", "Kosmonavtov", 10, 11)
//        );
//        Profiles profiles = new Profiles();
//        List<Profile> compareList = List.of(
//                new Profile(new Address("moscow", "krasnaya", 1, 2)),
//                new Profile(new Address("Korolev", "Kosmonavtov", 11, 11))
//        );
//        List<Address> rsl = profiles.collect(compareList);
//        assertThat(profile, is(false));
//    }
}