package com.company;

import com.company.employees.Employee;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmployeeManagementController {
    @FXML
    private TableView<Employee> employeeTable;
    @FXML
    private TableColumn<Employee, String> employeeIdColumn;
    @FXML
    private TableColumn<Employee, String> nameColumn;
    @FXML
    private TableColumn<Employee, String> emailColumn;
    @FXML
    private TableColumn<Employee, String> roleColumn;

    @FXML
    private void handleAddEmployee() {
        showAlert("Add Employee");
    }

    @FXML
    public void initialize() {
        // Initialize the table view with employee data
    }

    private void showAlert(String title) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText("Functionality to be implemented.");
        alert.showAndWait();
    }
}
