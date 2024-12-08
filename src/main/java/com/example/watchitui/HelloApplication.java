package com.example.watchitui;

import com.example.MainPackage.Movie;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Load the main scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("watchitMain.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 1280, 720);
        stage.setTitle("Watch it");
        stage.setScene(scene);
        stage.show();
        MoviePopupController.setScene(scene);
    }

    public void goToMovieDetails(Movie selectedMovie, ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movieDetails.fxml"));
        Parent movieDetailsRoot = loader.load();

        movieDetailsController controller = loader.getController();
        controller.setMovieDetails(selectedMovie);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(movieDetailsRoot));
    }

    public static void main(String[] args) {
        launch();
    }
}
