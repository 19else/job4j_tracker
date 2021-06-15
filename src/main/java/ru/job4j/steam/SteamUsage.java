package ru.job4j.steam;

import java.util.List;

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
                new Task("Bug 1", 10),
                new Task("Bug 3", 20),
                new Task("Fix 2", 100),
                new Task("Bug 4", 200),
                new Task("Bug 5", 300)
        );
        tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spend > 30)
                .map(task -> task.name + " " + task.spend)
                .forEach(System.out::println);
    }
}
