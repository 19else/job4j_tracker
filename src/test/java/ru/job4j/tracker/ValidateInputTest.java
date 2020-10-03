package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import javax.swing.*;
import static org.hamcrest.core.Is.is;

public class ValidateInputTest {
@Test
    public void whenInvalidExit() {
    Output out = new StubOutput();
    Input in = new StubInput(
            new String[] {"9", "0"}
    );
    Tracker tracker = new Tracker();
    UserAction[] actions = {
            new EndAction(out),
    };
    new StartUI(out).init(in, tracker, actions);
    Assert.assertThat(out.toString(), is(
            String.format(
                    "Menu: %n"
                            + "0. Exit%n"
                            + "Wrong input, you can selected 0..0%n"
                            + "Menu: %n"
                            + "0. Exit%n"
            )
    ) );
    }

    @Test
    public void whenInvalidInput() {
    Output out = new StubOutput();
    Input in = new StubInput(
            new String[] {"one", "1"}
    );
    ValidateInput input = new ValidateInput(out, in);
    int selected = input.askInt("Enter menu:");
    Assert.assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
    Output out = new StubOutput();
    Input in = new StubInput(
            new String[] {"0", "1", "2"}
    );
    ValidateInput input = new ValidateInput(out, in);
    int selected = input.askInt("Enter menu:");
    Assert.assertThat(selected, is(0));
    }

    @Test
    public void whenCheckOutput() {
    Output out = new StubOutput();
    Input in = new StubInput(
            new String[] {"one", "1" }
    );
    ValidateInput input = new ValidateInput(out, in);
    input.askInt("Enter number: ");
    Assert.assertThat(out.toString(), is(
         "Please enter validate data again" + System.lineSeparator()));
    }
}