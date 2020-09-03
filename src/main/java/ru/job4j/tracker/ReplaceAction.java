package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

        @Override
        public String name() {
            return "=== Replace ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
        out.println("=== Replace Item ===");
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

