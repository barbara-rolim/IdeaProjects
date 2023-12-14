package List;

import java.util.Comparator;

class TodoItemComparator implements java.util.Comparator<TodoItem> {
    @Override
    public int compare(TodoItem task1, TodoItem task2) {
        return Integer.compare(task1.getPriorityLevel(), task2.getPriorityLevel());
    }
}