package com.example.watchitui;
import com.example.MainPackage.Movie;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class movieDatabase {

    public static ArrayList<Movie> loadMoviesFromFile(String filePath) {
        ArrayList<Movie> movies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                movieDatabase.class.getResourceAsStream(filePath)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length >= 10) {
                    String title = parts[0];
                    String director = parts[1];
                    String releaseDate = parts[2];
                    double rating = Double.parseDouble(parts[3]);
                    String language = parts[4];
                    String country = parts[5];
                    List<String> cast = Arrays.asList(parts[6], parts[7]);
                    List<String> genres = List.of(parts[8]);
                    double budget = Double.parseDouble(parts[9]);

                    Movie movie = new Movie(title, releaseDate, director, country, budget, rating, language, genres, cast);
                    movies.add(movie);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
}
