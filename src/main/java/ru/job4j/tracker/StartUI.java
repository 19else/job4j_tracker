package ru.job4j.tracker;
import ru.job4j.oop.User;

import javax.swing.*;
import java.util.Arrays;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

   /** public static void createItem(Input input, Tracker tracker) {
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
    } **/

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Selected: ");

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
          if (select < 0 || select >= actions.length) {
              out.println("Wrong input, you can selected 0.." + (actions.length - 1));
              continue;
          }

            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu: ");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
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
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new FindAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindByIdAction(output),
                new FindByName(output),
                new EndAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        /** Вызов статического метода. Обращаемся через класс
        //StartUI.createItem(input, tracker); **/
    }
}
