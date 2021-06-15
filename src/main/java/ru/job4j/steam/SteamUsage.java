package ru.job4j.steam;

import java.util.List;
import java.util.stream.Collectors;

public class SteamUsage {
    public static class Task {
        private final String name;
        private final long spend;

        public Task(String name, long spend) {
            this.name = name;
            this.spend = spend;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name{" + name + '\''
                    + ", spend{" + spend
                    + "}";
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug 1", 100),
                new Task("Bug 3", 100),
                new Task("Fix 2", 100),
                new Task("Bug 4", 200),
                new Task("Bug 5", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}
