package ru.job4j.tracker;

public class FindByName implements UserAction {
    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

        @Override
        public String name() {
            return "=== Find by Name ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
            String name = input.askStr("Enter Item name for search: ");
            Item[] item = tracker.findByName(name);
            if (item.length > 0) {
                for (int index = 0; index < item.length; index++) {
                    out.println("Item name's : " + item[index]);
                }
            } else {
                out.println("Item " + name + " not found");
            }
            return false;
        }
    }

