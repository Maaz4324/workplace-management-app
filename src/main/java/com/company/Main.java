package com.company;

import com.company.employees.*;
import com.company.teams.*;
import com.company.tasks.*;
import com.company.communication.*;
import com.company.collaboration.*;
import com.company.resources.*;
import com.company.performance.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create employees
        Manager manager = new Manager("1", "Alice", "alice@example.com", "123-456-7890", "Design", "Manager");
        Employee designer = new AuxiliaryEmployee("2", "Bob", "bob@example.com", "123-456-7891", "Design", "Designer");
        Employee developer = new AuxiliaryEmployee("3", "Charlie", "charlie@example.com", "123-456-7892", "Development", "Developer");

        // Add team members
        manager.addTeamMember(designer);
        manager.addTeamMember(developer);

        // Create teams
        DesignTeam designTeam = new DesignTeam();
        DevelopmentTeam developmentTeam = new DevelopmentTeam();

        // Create and assign tasks
        TaskManagementSystem taskSystem = new TaskManagementSystem();
        taskSystem.createTask("101", "Design the homepage");
        taskSystem.assignTask("101", designer);

        // Communication system
        CommunicationSystem communicationSystem = new CommunicationSystem();
        communicationSystem.sendMessage("Alice", "Bob", "Please start designing the homepage.");

        // Collaboration system
        CollaborationSystem collaborationSystem = new CollaborationSystem();
        collaborationSystem.shareDocument("doc123", Arrays.asList(designer, developer));

        // Resource management
        ResourceManagementSystem resourceSystem = new ResourceManagementSystem();
        resourceSystem.uploadDocument("doc123", "Design specs for homepage");

        // Performance evaluation
        PerformanceEvaluationSystem performanceSystem = new PerformanceEvaluationSystem();
        performanceSystem.defineKPI("Design Quality", 5);
        performanceSystem.monitorPerformance("2", "Design Quality", 4);

        // Evaluate performance
        performanceSystem.evaluatePerformance("2");
    }
}
