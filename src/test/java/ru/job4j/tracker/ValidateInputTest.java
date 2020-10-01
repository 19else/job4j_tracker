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
            new String[] {"9"


                    }
    );
    Tracker tracker = new Tracker();
    UserAction[] actions = {
            new EndAction(out),


    };
    new StartUI(out).init(in, tracker, actions);
    Assert.assertThat(out.toString(), is(
            String.format(
                    "Menu.%n"
                            + "0. Exit%n"
                            + "Wrong input, you can select: 0 .. 0%n"
                            + "Menu.%n"
                            + "0. Exit%n"
            )
    ) );
    }
}