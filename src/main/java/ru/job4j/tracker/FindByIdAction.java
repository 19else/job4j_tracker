package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

        @Override
        public String name() {
            return "=== Find Item by Id ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            int id = input.askInt("Enter Id Item: ");
            if (tracker.findById(id) != null) {
                System.out.println("Item " + tracker.findById(id));
            } else {
                System.out.println("Item not found");
            }
            return true;
        }
    }

