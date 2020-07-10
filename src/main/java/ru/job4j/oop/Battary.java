package ru.job4j.oop;

public class Battary {
    private int load;

    public Battary(int charge) {
        this.load = charge;
    }

    public void exchange(Battary another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battary fullCharge = new Battary(100);
        Battary halfCharge = new Battary(50);
        System.out.println("Battary fullcharge is " + fullCharge.load + "%" + " " + " Battary halfcharge is " + halfCharge.load + "%");
        fullCharge.exchange(halfCharge);
        System.out.println("Battary charges is " + fullCharge.load + "%" + " " + " " + "Battary halfcharge is " + halfCharge.load);
    }
}
