package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int counter = 11;
        System.out.println("Привет! Это игра #Спички# Правила игры: ");
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. " +
                "Выигрывает тот, кто забрал последние спички. ");
        boolean player = true;
        String name = "";
         while (counter > 0) {
             name = player ? "Игрок 1" : "Игрок 2";
            System.out.println("На столе " + counter + " спичек");
                System.out.print("Введите количество спичек : ");
                int select = Integer.valueOf(input.nextLine());
                if (select > 0 && select < 4) {
                    System.out.println(name + " вытащил " + select + " спичек");
                    counter = counter - select;
                    player = !player;
                } else {
                    System.out.println("Вы ввели недопустимое значение. Повторите");
                }
         }
        if (counter == 0) {
            System.out.println("Выиграл игрок номер " + name + " со счетом - " );
            player = false;
        }
    }
}


