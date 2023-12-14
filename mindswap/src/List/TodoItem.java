package List;

public class TodoItem {
    private String taskName;
    private String taskDescription;
    private boolean taskComplete;
    private int priorityLevel;

    public TodoItem(String taskName, String taskDescription, int priorityLevel) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskComplete = true;
        this.priorityLevel = priorityLevel;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isTaskComplete() {
        return taskComplete;
    }

    public void setTaskComplete(boolean taskComplete) {
        this.taskComplete = taskComplete;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}
