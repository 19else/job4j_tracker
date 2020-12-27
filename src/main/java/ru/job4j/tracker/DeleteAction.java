package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

        @Override
        public String name() {
            return "=== Delete ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete Item ===");
            int id = input.askInt("Enter number Item for delete: ");

            if (tracker.delete(id)) {
                out.println("Delete is complete");
            } else {
                out.println("Can't delete this number");
            }
            return true;
        }
    }

