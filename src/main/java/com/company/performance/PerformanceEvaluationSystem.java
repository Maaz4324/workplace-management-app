package com.company.performance;

import java.util.HashMap;
import java.util.Map;

public class PerformanceEvaluationSystem {
    private Map<String, Map<String, Object>> performanceData;

    public PerformanceEvaluationSystem() {
        performanceData = new HashMap<>();
    }

    public void defineKPI(String kpiName, Object kpiValue) {
        System.out.println("KPI defined: " + kpiName + " = " + kpiValue);
    }

    public void monitorPerformance(String employeeId, String kpiName, Object kpiValue) {
        if (!performanceData.containsKey(employeeId)) {
            performanceData.put(employeeId, new HashMap<>());
        }
        performanceData.get(employeeId).put(kpiName, kpiValue);
        System.out.println("Performance monitored for " + employeeId + ": " + kpiName + " = " + kpiValue);
    }

    public void evaluatePerformance(String employeeId) {
        Map<String, Object> data = performanceData.get(employeeId);
        System.out.println("Performance evaluation for " + employeeId + ": " + data);
    }
}
