package List;

import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        TodoList todoList = new TodoList("Minha Lista de Tarefas");

        try {
            TodoItem task1 = new TodoItem("Tarefa 1", "Descrição para Tarefa 1", 2);
            TodoItem task2 = new TodoItem("Tarefa 2", "Descrição para Tarefa 2", 1);

            todoList.addTask(task1);
            todoList.addTask(task2);
            
            Iterator<TodoItem> iterator = (Iterator<TodoItem>) todoList.getAllTasks();
            while (iterator.hasNext()) {
                TodoItem task = iterator.next();
                System.out.println("Tarefa: " + task.getTaskName() +
                        ", Prioridade: " + task.getPriorityLevel() +
                        ", Completa: " + task.isTaskComplete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
