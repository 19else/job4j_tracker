package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.oop.User;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

    private static final String LN = System.lineSeparator();

    /**
     * @Test public void whenCreateItem() {
     * Input in = new StubInput(
     * new String[] {"0", "Item name", "1"}
     * );
     * Tracker tracker = new Tracker();
     * UserAction[] actions = {
     * new CreateAction(),
     * new EndAction()
     * };
     * new StartUI().init(in, tracker, actions);
     * assertThat(tracker.findAll()[0].getName(), is("Item name"));
     * }
     * @Test public void WhenReplaceItem() {
     * Tracker tracker = new Tracker();
     * //Добавим в трекер новую заявку
     * Item item = tracker.add(new Item("Replaced Item"));
     * //Входные данные должны содержать ID добавленной заявки item.getId()
     * String replaceName = "New Item name";
     * Input in = new StubInput(
     * new String[] {
     * "0" , "New Item name", Integer.toString(1), "1"
     * }
     * );
     * UserAction[] actions = {
     * new ReplaceAction(),
     * new EndAction()
     * };
     * new StartUI().init(in, tracker, actions);
     * assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
     * }
     * @Test public void whenDeleteItem() {
     * Tracker tracker = new Tracker();
     * //добавим новую заявку в Трекер
     * Item item = tracker.add(new Item("Deleted item"));
     * //Входные данные должны содержать ID добавленной заявки item.getId()
     * Input in = new StubInput(
     * new String[] {"0", Integer.toString(1), "1"}
     * );
     * UserAction[] actions = {
     * new DeleteAction(),
     * new EndAction()
     * };
     * new StartUI().init(in, tracker, actions);
     * //   assertThat(tracker.findById(item.getId()), is(nullValue()));
     * assertNull(tracker.findById(item.getId()));
     * }
     **/
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new EndAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]  {"0", "1"}
        );
        Tracker tracker = new Tracker();
         Item item = new Item("Sergey");
        tracker.add(item);
        UserAction[] actions = {
                new FindAllAction(out),
                new EndAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu: " + LN
                +  "0. Print all items" + LN
                +  "1. Exit" + LN
                + "=== Print all items ===" + LN
                +  "Item = Item{id=1, name='Sergey'}" + LN
                +  "Menu: " + LN
                +  "0. Print all items" + LN
                +  "1. Exit" + LN
        ));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Kuzmith", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = new Item("Kuzmith");
        tracker.add(item);
        UserAction[] actions = {
                new FindByName(out),
                new EndAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + LN
                        + "0. === Find by Name ===" + LN
                        + "1. Exit" + LN
                        + "=== Find items by name ==="
                        + LN + "Item name's : Item{id=1, name='Kuzmith'}" + LN
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = new Item("Petrovich");
        tracker.add(item);
        UserAction[] actions = {
                new FindByIdAction(out),
                new EndAction(out)

        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + LN
                        + "0. === Find by ID ===" + LN
                        + "1. Exit" + LN
                        + "=== Find Item by Id ===" + LN
                        + "Item Item{id=1, name='Petrovich'}" + LN
                        + "Menu: " + LN
                        + "0. === Find by ID ===" + LN
                        + "1. Exit" + LN
        ));
    }
}
    /**   @Test
    public void whenAddItem() {
        String[] answer = {"Fix PC"};
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answer = {
                "replaced item", String.valueOf(item.getId())
        };
        StartUI.replaceItem(new StubInput(answer), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("delete item");
        tracker.add(item);
        String[] answer = {
                String.valueOf(item.getId())
        };
        StartUI.deleteItem(new StubInput(answer), tracker);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    } **/
// }