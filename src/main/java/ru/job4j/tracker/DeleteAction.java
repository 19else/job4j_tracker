package ru.job4j.tracker;

public class DeleteAction implements UserAction {

        @Override
        public String name() {
            return "=== Delete Item ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            int id = input.askInt("Enter name Item for delete: ");
            if (tracker.delete(id)) {
                System.out.println("Delete is complete");
            } else {
                System.out.println("Can't delete this number");
            }
            return true;
        }
    }

