package com.company.employees;

public abstract class Employee {
    protected String employeeId;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected String department;
    protected String role;

    public Employee(String employeeId, String name, String email, String phoneNumber, String department, String role) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.role = role;
    }

    public abstract void performDuties();
    public abstract void communicate(String message);

    // Getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
