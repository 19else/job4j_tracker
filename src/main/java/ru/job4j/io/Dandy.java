package ru.job4j.io;
import java.util.Scanner;

public class Dandy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Games");
            System.out.println("1. Tanks");
            System.out.println("2. Super Mario");
            System.out.println("3. Quit");
            System.out.print("Choose your game: ");
            int select = Integer.valueOf(input.nextLine());
            if(select == 3) {
                System.out.println("Game over");
                run = false;
            } else if(select == 1) {
                System.out.println("Tank's loaded...");
            } else if(select == 2) {
                System.out.println("Super Mario is loaded...");
            } else {
                System.out.println("Game not found");
            }
            System.out.println();
        }
    }
}
