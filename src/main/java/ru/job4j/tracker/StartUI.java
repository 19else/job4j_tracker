package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item(5, "hello");
        tracker.add(item);
        tracker.replace(5, item);
        System.out.println(tracker.findById(1));
    }
}
