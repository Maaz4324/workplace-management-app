package com.company.teams;

import java.util.ArrayList;
import java.util.List;

import com.company.tasks.Task;

public class Project {
    private final String projectId;
    private final String projectName;
    private String status;
    private final List<Task> tasks;

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.status = "Not Started";
        this.tasks = new ArrayList<>();
    }

        public void addTask(Task task) {
        tasks.add(task);
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getProjectId() {
        return projectId;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
