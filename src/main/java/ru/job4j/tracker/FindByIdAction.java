package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

        @Override
        public String name() {
            return "=== Find by ID ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by Id ===");
            int id = input.askInt("Enter Id Item: ");
            if (tracker.findById(id) != null) {
                System.out.println("Item " + tracker.findById(id));
            } else {
                System.out.println("Item not found");
            }
            return true;
        }
    }

