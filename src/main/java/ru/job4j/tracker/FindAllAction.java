package ru.job4j.tracker;

public class FindAllAction implements UserAction {

        @Override
        public String name() {
            return "=== Print all item ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            System.out.println("=== Print all items ===");
            Item[] item = tracker.findAll();
            for (int index = 0; index < item.length; index++) {
                System.out.println("Item = " + item[index]);
            }
            return true;
        }
    }

