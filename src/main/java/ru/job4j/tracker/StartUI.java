package ru.job4j.tracker;
import java.util.Arrays;


public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
           // System.out.println("Selected: ");

            int select = Integer.valueOf(input.askInt("Selected: "));
            if(select == 0) {
                System.out.println("=== Create a new Item ====");
             //   System.out.print("Enter name: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if(select == 1) {
                System.out.println("=== Print all item ===");
                Item[] items = tracker.findAll();
                for (int index = 0; index < items.length; index++) {
                    System.out.println("Items = " + items[index]);
                }
            } else if(select == 2) {
                System.out.println("=== Edit item ===");
             //   System.out.print("Enter id Item: ");
                int id = input.askInt("Enter id Item: ");
             //   System.out.print("Enter name Item: ");
                String name = input.askStr("Enter name Item: ");
                Item item = new Item(name);
                if(tracker.replace(id, item)) {
                    System.out.println("Edit item success!");
                } else {
                    System.out.println("Editing failed");
                }
            } else if(select == 3) {
                System.out.println(" === Order deleted ===");
             //   System.out.print("Enter the Item number:");
                int number = input.askInt("Enter ID number: ");
                if(tracker.delete(number)) {
                    System.out.println("Delete is complete");
                } else {
                    System.out.println("Can't delete this number");
                }
            } else if(select == 4) {
                System.out.println("=== Find Item by Id ===");
              //  System.out.print("Enter id: ");
                int number = input.askInt("Enter id: ");
                Item id = tracker.findById(number);
                if(id != null) {
                    System.out.println(id);
                } else {
                    System.out.println("Item not found this id");
                }
            } else if(select == 5) {
                System.out.println("=== Find items by name ===");
             //   System.out.print("Enter name item: ");
                String name = input.askStr("Enter name item: ");
                Item[] item = tracker.findByName(name);
                if(item.length > 0) {
                    for (int index = 0; index < item.length; index++) {
                        System.out.println("item " + item[index]);
                    }
                } else {
                    System.out.println("This name's Item not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Choose your destiny: ");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();

        //   Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
