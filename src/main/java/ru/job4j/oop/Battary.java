package ru.job4j.oop;

public class Battary {
    private int load;

    public Battary(int charge) {
        load = charge;
    }

    public void exchange(Battary another) {
        another.load = load + another.load;
        /** этой конструкцией this.load = 0 мы задаем НОВОЕ значение переменной,
         * которая была выгружена в строке выше this.load
         *
         */
        load = 0;
    }

    public static void main(String[] args) {
        Battary one = new Battary(70);
        Battary two = new Battary(30);
        System.out.println("Battary charge One is " + one.load + "%" + " "
                + " Battary charge Two is " + two.load + "%");
        two.load = two.load - one.load;
        two.exchange(one);
        System.out.println("Battary charges One now is " + one.load + "%" + " " + " "
                + "Battary charge Two now is " + two.load + "%");
    }
}
