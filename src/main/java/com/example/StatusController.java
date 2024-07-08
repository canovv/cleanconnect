package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StatusController {

    @FXML
    private Button btnSleman;

    @FXML
    private Button btnBantul;

    @FXML
    private Button btnDana;

    @FXML
    private void toSleman() {
        try {
            // Muat file FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/sleman-view.fxml"));
            Parent slemanView = loader.load();
            
            // Dapatkan stage saat ini (mengasumsikan ini dipanggil dari dalam event handler)
            Stage stage = (Stage) btnSleman.getScene().getWindow();
            
            // Buat scene baru dengan root yang dimuat dari file FXML
            Scene scene = new Scene(slemanView);
            
            // Atur scene baru pada stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void toBantul() {
        try {
            // Muat file FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("bantul-view.fxml"));
            Parent bantulView = loader.load();
            
            // Dapatkan stage saat ini (mengasumsikan ini dipanggil dari dalam event handler)
            Stage stage = (Stage) btnBantul.getScene().getWindow();
            
            // Buat scene baru dengan root yang dimuat dari file FXML
            Scene scene = new Scene(bantulView);
            
            // Atur scene baru pada stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void toDana() {
        try {
            // Muat file FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dana-view.fxml"));
            Parent danaView = loader.load();
            
            // Dapatkan stage saat ini (mengasumsikan ini dipanggil dari dalam event handler)
            Stage stage = (Stage) btnDana.getScene().getWindow();
            
            // Buat scene baru dengan root yang dimuat dari file FXML
            Scene scene = new Scene(danaView);
            
            // Atur scene baru pada stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
