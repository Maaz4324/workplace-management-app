package com.company.collaboration;

import com.company.employees.Employee;

import java.util.List;

public class CollaborationSystem {
    public void shareDocument(String documentId, List<Employee> employees) {
        System.out.println("Document " + documentId + " shared with employees: " + employees);
    }

    public void versionControl(String documentId, String version) {
        System.out.println("Document " + documentId + " updated to version " + version);
    }
}
