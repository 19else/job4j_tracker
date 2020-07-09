package ru.job4j.oop;

public class Adventure {
    public static void main(String[] args) {
        Ball ball = new Ball();
        BadWolf badWolf = new BadWolf();
        Fox fox = new Fox();
        Hare hare = new Hare();
        badWolf.run(ball);
        hare.run(ball);
        fox.kill(ball);
    }
}
