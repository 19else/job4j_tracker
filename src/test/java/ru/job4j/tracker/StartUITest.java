package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.oop.User;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new EndAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void WhenReplaceItem() {
        Tracker tracker = new Tracker();
        /*Добавим в трекер новую заявку*/
        Item item = tracker.add(new Item("Replaced Item"));
        /*Входные данные должны содержать ID добавленной заявки item.getId()*/
        String replaceName = "New Item name";
        Input in = new StubInput(
                new String[] {
                        "0" , "New Item name", Integer.toString(1), "1"
                }
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new EndAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        /* добавим новую заявку в Трекер*/
        Item item = tracker.add(new Item("Deleted item"));
        /*Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0", Integer.toString(1), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new EndAction()
        };
        new StartUI().init(in, tracker, actions);
     //   assertThat(tracker.findById(item.getId()), is(nullValue()));
        assertNull(tracker.findById(item.getId()));
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
}