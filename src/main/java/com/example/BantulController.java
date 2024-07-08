package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BantulController {

        @FXML
    private Button btnDana;

    @FXML
    private Button btnBack;

   @FXML
    private void switchToDana(ActionEvent event) throws IOException {
        FXMLLoader danaLoader = new FXMLLoader(getClass().getResource("dana-view.fxml"));
        Parent root = danaLoader.load();

        DanaController danaController = danaLoader.getController();
        Button b = (Button) event.getSource();
        
        String btnText = "Pengolahan Air Limbah Bantul";
        System.out.println(btnText);

        danaController.setTitle(btnText);
        Stage stage = (Stage) b.getScene().getWindow();

        stage.setTitle(btnText);
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void toBack() {
        // try {
        //     // Muat file FXML
        //     FXMLLoader loader = new FXMLLoader(getClass().getResource("status-view.fxml"));
        //     Parent statusView = loader.load();
            
        //     // Dapatkan stage saat ini (mengasumsikan ini dipanggil dari dalam event handler)
        //     Stage stage = (Stage) btnDana.getScene().getWindow();
            
        //     // Buat scene baru dengan root yang dimuat dari file FXML
        //     Scene scene = new Scene(statusView);
            
        //     // Atur scene baru pada stage
        //     stage.setScene(scene);
        //     stage.show();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        try {
            // Muat file FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home-view.fxml"));
            Parent statusView = loader.load();
            
            // Dapatkan stage saat ini (mengasumsikan ini dipanggil dari dalam event handler)
            Stage stage = (Stage) btnBack.getScene().getWindow();
            
            // Buat scene baru dengan root yang dimuat dari file FXML
            Scene scene = new Scene(statusView);
            
            // Atur scene baru pada stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
