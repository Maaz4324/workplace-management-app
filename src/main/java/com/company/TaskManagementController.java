package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class TaskManagementController {

    @FXML
    private void handleCreateTask() {
        showAlert("Create Task");
    }

    @FXML
    private void handleAssignTask() {
        showAlert("Assign Task");
    }

    private void showAlert(String title) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText("Functionality to be implemented.");
        alert.showAndWait();
    }
}
