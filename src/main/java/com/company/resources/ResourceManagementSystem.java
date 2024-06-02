package com.company.resources;

import java.util.HashMap;
import java.util.Map;

public class ResourceManagementSystem {
    private Map<String, String> documentRepository;

    public ResourceManagementSystem() {
        documentRepository = new HashMap<>();
    }

    public void uploadDocument(String documentId, String content) {
        documentRepository.put(documentId, content);
        System.out.println("Document " + documentId + " uploaded.");
    }

    public String getDocument(String documentId) {
        return documentRepository.get(documentId);
    }

    public void allocateBudget(String projectId, double amount) {
        System.out.println("Budget of " + amount + " allocated to project " + projectId);
    }
}
