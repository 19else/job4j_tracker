package ru.job4j.excersises;

import ru.job4j.search.Task;

import java.util.LinkedList;

public class TaskCheck {
    private String desc;
    private int priority;

    public TaskCheck(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}



