package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 11;
        int player = 1;
        System.out.println("Привет! Это игра #Спички# Правила игры: ");
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. " +
                "Выигрывает тот, кто забрал последние спички. ");

         while (counter > 0) {
            System.out.println("На столе " + counter + " спичек");
                System.out.print("Введите количество спичек : ");
                int select = Integer.valueOf(input.nextLine());
                if (select > 0 && select < 4) {
                    System.out.println("Игрок " + player + " вытащил " + select + " спичек");
                    counter = counter - select;
                    player++;
                    if (counter == 0) {

                        System.out.println("Выиграл игрок номер " + player + " со счетом - " + select);
                    }
                } else {
                    System.out.println("Вы ввели недопустимое значение. Повторите");
                }
            }

        }
    }


