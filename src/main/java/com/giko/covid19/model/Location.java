package com.giko.covid19.model;

public class Location {

    private String country;
    private String state;
    private int latestTotalCases;
    private int differenceFromPreviousDay;

    public Location() {
    }

    public Location(String country, String state, int latestTotalCases, int differenceFromPreviousDay) {
        this.country = country;
        this.state = state;
        this.latestTotalCases = latestTotalCases;
        this.differenceFromPreviousDay = differenceFromPreviousDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getDifferenceFromPreviousDay() {
        return differenceFromPreviousDay;
    }

    public void setDifferenceFromPreviousDay(int differenceFromPreviousDay) {
        this.differenceFromPreviousDay = differenceFromPreviousDay;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", differenceFromPreviousDay=" + differenceFromPreviousDay +
                '}';
    }
}
