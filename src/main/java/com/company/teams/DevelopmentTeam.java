package com.company.teams;

import java.util.ArrayList;
import java.util.List;

import com.company.employees.Employee;
import com.company.tasks.Task;

public class DevelopmentTeam implements Team {
    private List<Employee> teamMembers;
    private final List<Project> developmentProjects;

    public DevelopmentTeam() {
        this.teamMembers = new ArrayList<>();
        this.developmentProjects = new ArrayList<>();
    }

    @Override
    public void createProject(String projectId, String projectName) {
        Project newProject = new Project(projectId, projectName);
        developmentProjects.add(newProject);
    }

    @Override
    public void assignTask(String taskId, Employee employee) {
        for (Project project : developmentProjects) {
            for (Task task : project.getTasks()) {
                if (task.getTaskId().equals(taskId)) {
                    task.assignTo(employee);
                }
            }
        }
    }

    @Override
    public void updateProjectStatus(String projectId, String status) {
        for (Project project : developmentProjects) {
            if (project.getProjectId().equals(projectId)) {
                project.updateStatus(status);
            }
        }
    }

    @Override
    public void collaborate() {
        System.out.println("Development team is collaborating on projects.");
    }

    // Additional development team-specific methods can be added here
}
