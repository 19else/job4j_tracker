package ru.job4j.tracker;

public class Item {
    private String id;
    private String name;


    public Item() {
    }

    public Item(String number) {
            this.id = number;
        }

    public Item(String number, String surname) {
            this.id = number + " 2020 year";
            this.name = surname;
    }

    public static void main(String[] args) {
        Item empty = new Item();
        Item id = new Item("22 june");
        Item idString = new Item("22 june", "Elovikov");
        id.name = "Sergey";
        idString.id = "empty";
      }
}


    /**private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }**/


