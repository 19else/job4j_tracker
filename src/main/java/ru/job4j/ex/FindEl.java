package ru.job4j.ex;

import javax.swing.text.Element;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rlt = -1;
        for (int index = 0; index < values.length; index++) {
            if (values[index].equals(key)) {
                rlt = index;
                System.out.println("Индекс найденного элемента: " + rlt + " Имя ключа: " + key);
                System.out.println();
                break;
            }
        }
        if (rlt == -1) {
           throw new ElementNotFoundException("Имя ключа " + key + " не найдено в массиве");
        }
        return rlt;
    }

    public static void main(String[] args) {
        try {
            String[] array = {"1", "hello", "3", "4"};
            FindEl.indexOf(array, "hello");
            FindEl.indexOf(array, "5");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

        /**  public static boolean sent(String value, String[] abuses) throws ElementAbuseExeption {

         return true;
         } **/

