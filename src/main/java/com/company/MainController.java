package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainController {

    @FXML
    private void handleManageEmployees() {
        showAlert("Manage Employees");
        // Load Employee Management UI
    }

    @FXML
    private void handleManageTasks() {
        showAlert("Manage Tasks");
        // Load Task Management UI
    }

    @FXML
    private void handleManageTeams() {
        showAlert("Manage Teams");
        // Load Team Management UI
    }

    private void showAlert(String title) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText("Functionality to be implemented.");
        alert.showAndWait();
    }
}
