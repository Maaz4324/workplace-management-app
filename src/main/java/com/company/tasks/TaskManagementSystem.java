package com.company.tasks;



import java.util.ArrayList;
import java.util.List;

import com.company.employees.Employee;

public class TaskManagementSystem {
    private final List<Task> tasks;

    public TaskManagementSystem() {
        tasks = new ArrayList<>();
    }

    public void createTask(String taskId, String description) {
        Task newTask = new Task(taskId, description);
        tasks.add(newTask);
    }

    public void assignTask(String taskId, Employee employee) {
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                task.assignTo(employee);
            }
        }
    }

    public void updateTaskStatus(String taskId, String status) {
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                task.updateStatus(status);
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
