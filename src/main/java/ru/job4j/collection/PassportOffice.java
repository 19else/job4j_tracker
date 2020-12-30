package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizenStringMap = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if(!citizenStringMap.containsKey(citizen.getPassport())) {
            citizenStringMap.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
    return citizenStringMap.get(passport);
    }
}
