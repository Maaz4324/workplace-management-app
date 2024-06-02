package com.company.teams;

import com.company.employees.Employee;

public interface Team {
    void createProject(String projectId, String projectName);
    void assignTask(String taskId, Employee employee);
    void updateProjectStatus(String projectId, String status);
    void collaborate();
}
