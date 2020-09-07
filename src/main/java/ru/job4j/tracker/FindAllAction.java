package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

        @Override
        public String name() {
            return "Print all items";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {

            out.println("=== Print all items ===");
            Item[] item = tracker.findAll();
            for (int index = 0; index < item.length; index++) {
                out.println("Item = " + item[index]);
            }
            return true;
        }
    }

