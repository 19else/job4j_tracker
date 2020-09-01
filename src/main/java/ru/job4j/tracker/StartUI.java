package ru.job4j.tracker;
import ru.job4j.oop.User;

import javax.swing.*;
import java.util.Arrays;

public class StartUI {
    public class CreateAction implements UserAction {

        @Override
        public String name() {
            return "=== Create new Item ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr("Enter name: ");
            Item item = new Item(name);
            tracker.add(item);
            return true;
        }
    }

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

    public static class ReplaceAction implements UserAction {

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

    public class FindByName implements UserAction {

        @Override
        public String name() {
            return "=== Find items by name ===";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr("Enter Item name for search: ");
            Item[] item = tracker.findByName(name);
            if (item.length > 0) {
                for (int index = 0; index < item.length; index++) {
                    System.out.println("Item name's : " + item[index]);
                }
            } else {
                System.out.println("Item " + name + " not found");
            }
            return false;
        }
    }
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAll(Input input, Tracker tracker) {
        System.out.println("=== Print all item ===");
        Item[] item = tracker.findAll();
        for (int index = 0; index < item.length; index++) {
            System.out.println("Item = " + item[index]);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Replace Item ===");
        String name = input.askStr("Enter name Item for replace: ");
        int id = input.askInt("Enter ID Item for replace: ");
        Item item = new Item(id, name);
        if(tracker.replace(id, item)) {
            System.out.println("Edit item success!");
        } else {
            System.out.println("Editing failed");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        int id = input.askInt("Enter name Item for delete: ");
        if(tracker.delete(id)) {
            System.out.println("Delete is complete");
        } else {
            System.out.println("Can't delete this number");
        }
    }

        public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Id === ");
        int id = input.askInt("Enter ID Item: ");
         if(tracker.findById(id) != null) {
             System.out.println("Item " + tracker.findById(id));
         } else {
             System.out.println("Item not found");
         }
      }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter Item name for search: ");
        Item[] item = tracker.findByName(name);
        if(item.length > 0) {
            for (int index = 0; index < item.length; index++) {
                System.out.println("Item = " + item[index]);
            }
        } else {
            System.out.println("Item = " + name + "not found");
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Selected: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
          /**  if(select == 0) {
                StartUI.createItem(input, tracker);
            } else if(select == 1) {
                StartUI.findAll(input, tracker);
            } else if(select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if(select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if(select == 4) {
                StartUI.findItemById(input, tracker);
            } else if(select == 5) {
                StartUI.findItemByName(input,tracker);
            } else if (select == 6) {
                run = false;
            } **/
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }

       /** System.out.println("Choose your destiny: ");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program"); **/
    }

       public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByName()
        };
        new StartUI().init(input, tracker, actions);
        /* Вызов статического метода. Обращаемся через класс */
        //StartUI.createItem(input, tracker);
    }
}
