package com.example.watchitui;

import com.example.MainPackage.Movie;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private ImageView moviePoster;

    public void initialize() {
        moviePoster.setImage(new Image("images/shawshankredemption.jpg"));

        ArrayList<Movie> movies = movieDatabase.loadMoviesFromFile("/data/movies.txt");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }

        moviePoster.setOnMouseClicked(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("movieDetails.fxml"));
                Parent root = loader.load();

                movieDetailsController controller = loader.getController();

                Movie selectedMovie = movies.get(0);
                controller.setMovieDetails(selectedMovie);

                // Switch the scene
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

