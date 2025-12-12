package org.example.hotelbkn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("reservation-view.fxml"));
        if (HelloApplication.class.getResource("reservation-view.fxml") == null) {
            System.err.println("Error. FXML not found.");
            return;
        }
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);

        stage.setTitle("Hotel Booking System");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}