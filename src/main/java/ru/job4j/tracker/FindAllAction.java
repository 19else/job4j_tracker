package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

        @Override
        public String name() {
            return "=== Print ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
        out.println("=== Print all item out.println ===");
            out.println("=== Print all items ===");
            Item[] item = tracker.findAll();
            for (int index = 0; index < item.length; index++) {
                out.println("Item = " + item[index]);
            }
            return true;
        }
    }

