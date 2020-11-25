package ru.job4j.excersises;

import java.util.Arrays;
import java.util.LinkedList;

public class PriorityTask {
    private LinkedList<TaskCheck> checks = new LinkedList<>();

    public void puting(TaskCheck taskCheck) {
        int index = 0;
        for (TaskCheck value : checks
             ) {
            System.out.println("Value = " + value.getDesc());
            if(taskCheck.getPriority() < value.getPriority()) {
                System.out.println("taskCheck = " + taskCheck.getPriority() + " " +
                        "value = " + value.getPriority());
                break;
            }
            System.out.println("index = " + index);
            index++;
        }
        this.checks.add(index, taskCheck);
    }
    public TaskCheck take() {
        return checks.poll();
    }
}
