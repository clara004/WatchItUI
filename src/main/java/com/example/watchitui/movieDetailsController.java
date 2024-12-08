package com.example.watchitui;
import com.example.MainPackage.Movie;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class movieDetailsController {
    @FXML private Label titleLabel;
    @FXML private Label releaseDateLabel;
    @FXML private Label directorLabel;
    @FXML private Label countryLabel;
    @FXML private Label budgetNumber;
    @FXML private Label revenueLabel;
    @FXML private Label runningTimeLabel;
    @FXML private ListView<Float> ratingListView;
    @FXML private ListView<String> languagesListView;
    @FXML private ListView<String> genresListView;
    @FXML private ListView<String> castListView;

    public void setMovieDetails(Movie movie) {
        titleLabel.setText(movie.getTitle());
        releaseDateLabel.setText(movie.getReleaseDate().toString());
        directorLabel.setText(movie.getDirector());
        countryLabel.setText(movie.getCountry());
        budgetNumber.setText(String.valueOf(movie.getBudget()));
        revenueLabel.setText(String.valueOf(movie.getRevenue()));
        runningTimeLabel.setText(String.valueOf(movie.getRunningTime()));
        ratingListView.getItems().setAll(movie.getRating());
        languagesListView.getItems().setAll(movie.getLanguages());
        genresListView.getItems().setAll(movie.getGenres());
        castListView.getItems().setAll(movie.getCast());
    }
}
