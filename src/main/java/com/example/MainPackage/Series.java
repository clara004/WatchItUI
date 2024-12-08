package Watchit;

import java.util.List;

public class Series {
    private int SeriesID;
    private String title;
    private String ReleaseDate;
    private List<Episode> episodes;
    private List <Season> seasons;
    private String director;
    private String country;
    private double budget;
    private double revenue;
    private List<Float> rating;
    private List<String> languages;
    private List<String> genres;
    private List <String> cast;

    public Series(int SeriesID, String title, String releaseDate, List<Episode> episodes, List<Season> seasons , int noOfSeasons, String director, String country, double budget, double revenue, List<Float> rating, List<String> languages, List<String> genres, List<String> cast) {
        this.SeriesID = SeriesID;
        this.title = title;
        this.ReleaseDate=releaseDate;
        this.episodes = episodes;
        this.seasons = seasons;
        this.director = director;
        this.country=country;
        this.budget=budget;
        this.revenue=revenue;
        this.rating=rating;
        this.languages=languages;
        this.genres=genres;
        this.cast=cast;
    }

    public int getSeriesID() {
        return SeriesID;
    }

    public void setSeriesID(int seriesID) {
        SeriesID = seriesID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
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

    public List<Float> getRating() {
        return rating;
    }

    public void setRating(List<Float> rating) {
        this.rating = rating;
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

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
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
}
