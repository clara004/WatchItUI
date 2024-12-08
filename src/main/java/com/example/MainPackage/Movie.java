package com.example.MainPackage;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private int MovieID;
    private String title;
    private LocalDate ReleaseDate;
    private int runningTime;// In min
    private String director;
    private String country;
    private double budget;
    private double revenue;
    private List<Float> rating;
    private List<String> languages;
    private List<String> genres;
    private List <String> cast;

    public Movie(int MovieID, String title, String ReleaseDate, int runningTime, String director, String country, double budget, double revenue, List<Float> rating, List<String> languages, List<String> genres, List<String> cast) {
        this.MovieID = MovieID;
        this.title = title;
        this.ReleaseDate = LocalDate.parse(ReleaseDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.runningTime = runningTime;
        this.director = director;
        this.country=country;
        this.budget=budget;
        this.revenue=revenue;
        this.rating=rating;
        this.languages=languages;
        this.genres=genres;
        this.cast=cast;
    }

    public Movie(String title, String releaseDate, String director, String country, double budget, double rating, String language, List<String> genres, List<String> cast) {
    }

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int movieID) {
        MovieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.ReleaseDate = LocalDate.parse(releaseDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }


    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public List<Float> getRating() {
        return rating;
    }

    public void setRating(List<Float> rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Watchit.Movie{" +
                "MovieID=" + MovieID +
                ", title='" + title + '\'' +
                ", ReleaseDate='" + ReleaseDate + '\'' +
                ", runningTime=" + runningTime +
                ", director='" + director + '\'' +
                ", country='" + country + '\'' +
                ", budget=" + budget +
                ", revenue=" + revenue +
                ", rating=" + rating +
                ", languages=" + languages +
                ", genres=" + genres +
                ", cast=" + cast +
                '}';
    }

    public float calcRating() {
        float averageRating = 0;

        if (rating != null) { //if there is exception !!
            float sum = 0;
            for(Float avg: rating ) {
                sum += avg;
            }
            averageRating = sum / rating.size();
        }
        return averageRating;
    }

    public String CalcDuration() {
        int hrs = runningTime / 60;
        int min = runningTime % 60;

        if (hrs != 0) {
            return hrs + " hrs " + min + " min";
        } else {
            return min + " min";
        }
    }

}
