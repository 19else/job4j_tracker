package ru.job4j.excersises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PriorityExecute {
    public static void main(String[] args) {
        PriorityTask task = new PriorityTask();

        task.puting(new TaskCheck("middle", 2));
        task.puting(new TaskCheck("Low", 3));
        task.puting(new TaskCheck("High_last", 1));
        task.puting(new TaskCheck("High", 1));
        TaskCheck result = task.take();
        System.out.println("toString = " + task);
        System.out.println("Индекс приоритета = " + result.getPriority());
        System.out.println("Важность: " + result.getDesc());
    }
}
