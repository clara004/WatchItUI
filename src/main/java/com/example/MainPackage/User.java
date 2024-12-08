package com.example.MainPackage;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
public class User extends Person {
    private String UserName;
    private int UserId;
    Subscription subscription ;
    private List<Movie> movies;
    //list of user watch record
    Account account;

    public User(String FirstName, String LastName, LocalDate dateOfBirth, String gender, String userName, int userId, Subscription subscription,List<Movie> movies,  Account account) {
        super(FirstName, LastName, dateOfBirth, gender);
        this.UserName = userName;
        this.UserId = userId;
        this.subscription = subscription;
        this.movies = movies;
        this.account = account;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }
    public static int CalculateAge (LocalDate dateOfBirth){
        LocalDate CurrentDate=LocalDate.now();
        Period age=Period.between(dateOfBirth,CurrentDate);
        return age.getYears();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}