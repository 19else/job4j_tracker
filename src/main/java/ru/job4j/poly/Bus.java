package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passangers(String number) {
        return 0;
    }

    @Override
    public int fillUp(int liters) {
        int price = 10;
        return price * liters;
    }
}
