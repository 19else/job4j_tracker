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
        int n = 0;
        int m = 5;
            for (int index = n;  index < m; index++) {
                System.out.println(index);
            }
        }
    }

