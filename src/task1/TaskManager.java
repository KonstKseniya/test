package task1;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(String name) {
        Task nameRemove = null;
        for (Task task: taskList) {
            if (task.getName().equals(name)) {
                nameRemove = task;
                break;
            }
        }
        if (nameRemove != null) {
            taskList.remove(nameRemove);
        }

    }

    public void viewTasks() {
        for (Task task: taskList) {
            System.out.println(task);
        }
    }
}