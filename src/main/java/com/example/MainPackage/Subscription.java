package com.example.MainPackage;
import java.util.Date;
public class Subscription {
    private int UserId;
    private double BasicPrice;
    private double StandardPrice;
    private double PremiumPrice;
    private String Plan;
    private Date StartDate;
    private Date EndDate;

    public Subscription(double basicPrice, Date endDate, String plan, double premiumPrice, double standardPrice, Date startDate, int userId) {
        this.BasicPrice = basicPrice;
        this.EndDate = endDate;
        this.Plan = plan;
        this.PremiumPrice = premiumPrice;
        this.StandardPrice = standardPrice;
        this.StartDate = startDate;
        this.UserId = userId;
    }



}