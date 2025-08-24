package com.mycompany.jfx_mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void showMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Good Morning!");
        alert.showAndWait();
    }
}
