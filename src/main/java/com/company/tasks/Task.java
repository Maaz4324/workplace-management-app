package com.company.tasks;

import com.company.employees.Employee;

public class Task {
    private final String taskId;
    private final String description;
    private String status;
    private Employee assignedTo;

    public Task(String taskId, String description) {
        this.taskId = taskId;
        this.description = description;
        this.status = "Pending";
    }

    public void assignTo(Employee employee) {
        this.assignedTo = employee;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Employee getAssignedTo() {
        return assignedTo;
    }
}
