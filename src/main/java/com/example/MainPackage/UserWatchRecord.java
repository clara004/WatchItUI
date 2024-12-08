package com.example.MainPackage;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class UserWatchRecord {
    private int UserId;
    private List<Movie> movies;
    private LocalDate dateOfBirth;
    //Rating

    public UserWatchRecord (int UserId, List<Movie> movies, LocalDate dateOfBirth) {
        this.UserId = UserId;
        this.dateOfBirth = dateOfBirth;
        this.movies = movies;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
