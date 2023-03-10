package com.mbkm.project4.Model;

public class BusModel {
    String busName;
    String desk;
    String price;
    Integer imageUrl;

    public BusModel(String busName, String desk, String price, Integer imageUrl) {
        this.busName = busName;
        this.desk = desk;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
