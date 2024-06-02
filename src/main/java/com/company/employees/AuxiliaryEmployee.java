package com.company.employees;

public class AuxiliaryEmployee extends Employee {
    public AuxiliaryEmployee(String employeeId, String name, String email, String phoneNumber, String department, String role) {
        super(employeeId, name, email, phoneNumber, department, role);
    }

    public void requestAssistance() {
        System.out.println(name + " is requesting assistance from the manager.");
    }

    public void reportProgress() {
        System.out.println(name + " is reporting progress to the manager.");
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is performing auxiliary duties.");
    }

    @Override
    public void communicate(String message) {
        System.out.println("Message to " + name + ": " + message);
    }

    // Additional auxiliary employee-specific methods can be added here
}
