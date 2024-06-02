package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class TeamManagementController {

    @FXML
    private void handleCreateTeam() {
        showAlert("Create Team");
    }

    @FXML
    private void handleManageProjects() {
        showAlert("Manage Projects");
    }

    private void showAlert(String title) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText("Functionality to be implemented.");
        alert.showAndWait();
    }
}
