package com.example.doodleblue_project.adapters;

public class AvailableListItem {

    private String productName ;
    private String rating ;
    private String countryCode ;
    private String size ;
    private String rate ;
    private String date ;
    private String retailerName ;

    public AvailableListItem() {
    }

    public AvailableListItem(String productName, String rating, String countryCode, String size, String rate, String date, String retailerName) {
        this.productName = productName;
        this.rating = rating;
        this.countryCode = countryCode;
        this.size = size;
        this.rate = rate;
        this.date = date;
        this.retailerName = retailerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }
}
