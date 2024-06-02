package com.company.employees;

import java.util.ArrayList;
import java.util.List;

import com.company.tasks.Task;

public class Manager extends Employee {
    private final List<Employee> teamMembers;
    private final List<Task> tasks;

    public Manager(String employeeId, String name, String email, String phoneNumber, String department, String role) {
        super(employeeId, name, email, phoneNumber, department, role);
        this.teamMembers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addTeamMember(Employee employee) {
        teamMembers.add(employee);
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

    @Override
    public void performDuties() {
        System.out.println(name + " is overseeing the team's performance.");
    }

    @Override
    public void communicate(String message) {
        for (Employee member : teamMembers) {
            System.out.println("Message to " + member.getName() + ": " + message);
        }
    }

    // Additional manager-specific methods can be added here
}
