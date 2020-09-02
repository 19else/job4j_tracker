package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

        @Override
        public String name() {
            return "=== Replace Item ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr("Enter name Item for replace: ");
            int id = input.askInt("Enter ID Item for replace: ");
            Item item = new Item(id, name);
            if(tracker.replace(id, item)) {
                System.out.println("Edit item success!");
            } else {
                System.out.println("Editing failed");
            }
            return true;
        }
    }

