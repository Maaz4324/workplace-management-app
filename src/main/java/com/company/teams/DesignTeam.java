package com.company.teams;

import java.util.ArrayList;
import java.util.List;

import com.company.employees.Employee;
import com.company.tasks.Task;

public class DesignTeam implements Team {
    private final List<Employee> teamMembers;
    private final List<Project> designProjects;

    public DesignTeam() {
        this.teamMembers = new ArrayList<>();
        this.designProjects = new ArrayList<>();
    }

    @Override
    public void createProject(String projectId, String projectName) {
        Project newProject = new Project(projectId, projectName);
        designProjects.add(newProject);
    }

    @Override
    public void assignTask(String taskId, Employee employee) {
        for (Project project : designProjects) {
            for (Task task : project.getTasks()) {
                if (task.getTaskId().equals(taskId)) {
                    task.assignTo(employee);
                }
            }
        }
    }

    @Override
    public void updateProjectStatus(String projectId, String status) {
        for (Project project : designProjects) {
            if (project.getProjectId().equals(projectId)) {
                project.updateStatus(status);
            }
        }
    }

    @Override
    public void collaborate() {
        System.out.println("Design team is collaborating on projects.");
    }

    // Additional design team-specific methods can be added here
}
