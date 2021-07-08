package ru.job4j.steam;

public class Animal {
    private String fish;
    private String amphibian;
    private String bird;
    private String reptile;
    private String beast;
    private int size;
    private double weight;
    private boolean fly;
    private boolean swim;

    public Animal() {

    }

    public Animal(String fish, String amphibian, String bird,
                  String reptile, String beast, int size,
                  double weight, boolean fly, boolean swim) {
        this.fish = fish;
        this.amphibian = amphibian;
        this.bird = bird;
        this.reptile = reptile;
        this.beast = beast;
        this.size = size;
        this.weight = weight;
        this.fly = fly;
        this.swim = swim;
    }

    static class Builder {
        private String fish;
        private String amphibian;
        private String bird;
        private String reptile;
        private String beast;
        private int size;
        private double weight;
        private boolean fly;
        private boolean swim;

        Builder builderFish(String fish) {
            this.fish = fish;
            return this;

        }

        Builder builderAmphibian(String amphibian) {
            this.amphibian = amphibian;
            return this;
        }

        Builder builderBird(String bird) {
            this.bird = bird;
            return this;
        }

        Builder builderReptile(String reptile) {
            this.reptile = reptile;
            return this;
        }

        Builder builderBeast(String beast) {
            this.beast = beast;
            return this;
        }

        Builder builderSize(int size) {
            this.size = size;
            return this;
        }

        Builder builderWeight(double weight) {
            this.weight = weight;
            return this;
        }

        Builder builderFly(boolean fly) {
            this.fly = fly;
            return this;
        }

        Builder builderSwim(boolean swim) {
            this.swim = swim;
            return this;
        }

        Animal build() {
            Animal animal = new Animal();
            animal.swim = swim;
            animal.fly = fly;
            animal.fish = fish;
            animal.weight = weight;
            animal.size = size;
            animal.beast = beast;
            animal.bird = bird;
            animal.amphibian = amphibian;
            animal.reptile = reptile;
            return animal;
        }
    }

    @Override
    public String toString() {
        return "Builder{" +
                "fish='" + fish + '\'' +
                ", amphibian='" + amphibian + '\'' +
                ", bird='" + bird + '\'' +
                ", reptile='" + reptile + '\'' +
                ", beast='" + beast + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", fly=" + fly +
                ", swim=" + swim +
                '}';
    }

    public static void main(String[] args) {
        Animal fish = new Builder().builderFish("Сельдь")
                .builderSize(10)
                .builderFly(false)
                .builderSwim(true)
                .builderWeight(30)
                .build();
        Animal reptile = new Builder().builderReptile("Крокодил")
                .builderSize(20)
                .builderWeight(120.5)
                .builderFly(false)
                .builderSwim(true)
                .build();
        System.out.println(fish);
        System.out.println(reptile);
    }
}
