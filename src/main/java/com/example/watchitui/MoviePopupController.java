package com.example.watchitui;

import com.example.MainPackage.Movie;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class MoviePopupController {
    @FXML
    public ImageView moviePoster;
    @FXML
    public ImageView moviePoster2;
    @FXML
   public static Scene scene;
    @FXML
    public static GridPane movieGrid;

    public static void setScene(Scene scene) {
        MoviePopupController.scene = scene;

    }

    public void MoveDetails(){
        Image image = moviePoster.getImage();
        String imageUrl = image.getUrl(); // Get the URL of the image
        System.out.println("Image URL: " + imageUrl);
        switchScene("movieDetails.fxml");
    }

    public void switchScene(String fxml){

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        try {
            scene.setRoot(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

