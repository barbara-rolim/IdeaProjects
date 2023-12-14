package List;

import java.util.Iterator;
import java.util.PriorityQueue;


public class TodoList {
    private String name;
    private PriorityQueue<TodoItem> tasks;

    public TodoList(String name) {
        this.name = name;
        this.tasks = new PriorityQueue<>(new TodoItemComparator());
    }

    public void addTask(TodoItem task) {
        tasks.add(task);
    }

    public void removeTask(TodoItem task) {
        tasks.remove(task);
    }

    public TodoItem getNextTask() {
        return tasks.peek();
    }

    public Iterator<TodoItem> getAllTasks() {
        return tasks.iterator();
    }

    public Iterator<TodoItem> getIncompleteTasks() {
        PriorityQueue<TodoItem> incompleteTasks = new PriorityQueue<>(new TodoItemComparator());
        for (TodoItem task : tasks) {
            if (!task.isTaskComplete()) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks.iterator();
    }

    public Iterator<TodoItem> getCompleteTasks() {
        PriorityQueue<TodoItem> completeTasks = new PriorityQueue<>(new TodoItemComparator());
        for (TodoItem task : tasks) {
            if (task.isTaskComplete()) {
                completeTasks.add(task);
            }
        }
        return completeTasks.iterator();
    }

    public void markTaskComplete(TodoItem task) {
        task.setTaskComplete(true);
    }

    public void markTaskIncomplete(TodoItem task) {
        task.setTaskComplete(false);
    }
}