package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DanaController {

    @FXML
    private Label lbTitle;

    @FXML
    private void backToHome() throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home-view.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) lbTitle.getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void setTitle(String title) {
        if (lbTitle != null) {
            lbTitle.setText(title);
        } else {
            System.err.println("Label lbTitle is not initialized.");
        }
    }
}
