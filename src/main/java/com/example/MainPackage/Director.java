package com.example.MainPackage;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Director extends com.example.MainPackage.Person {
    private String Nationality;
    private List<Movie> movies;
    private ArrayList<SocialMediaLink> socialMediaLink;

    public Director(String FirstName, String LastName, LocalDate dateOfBirth, String gender,List<Movie> movies, String nationality, ArrayList<SocialMediaLink> socialMediaLink) {
        super(FirstName, LastName, dateOfBirth, gender);
        Nationality = nationality;
        this.movies = movies;
        this.socialMediaLink = socialMediaLink;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getNationality() {
        return Nationality;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<SocialMediaLink> getSocialMediaLink() {
        return socialMediaLink;
    }

    public void setSocialMediaLink(ArrayList<SocialMediaLink> socialMediaLink) {
        this.socialMediaLink = socialMediaLink;
    }
}