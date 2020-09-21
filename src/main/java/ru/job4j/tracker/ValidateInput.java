package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                //Integer.valueOf(question);
                invalid = false;

            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again");
            }

       } while (invalid);
        return value;
    }

  /**  @Override
    public String askStr(String question) {
        boolean invalid = true;
        do {
            try {
                Integer.valueOf(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("You enter text. Please enter number again");
            }
        } while (invalid);
        return "Кккк"; **/
    }



