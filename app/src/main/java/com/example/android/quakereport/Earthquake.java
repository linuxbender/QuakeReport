package com.example.android.quakereport;

public class Earthquake {

    private double magnitude;
    private String eventLocation;
    private long eventDate;
    private String url;

    public Earthquake(double magnitude, String eventLocation, long eventDate, String url) {
        setMagnitude(magnitude);
        setEventLocation(eventLocation);
        setEventDate(eventDate);
        setUrl(url);
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public long getEventDate() {
        return eventDate;
    }

    public void setEventDate(long eventDate) {
        this.eventDate = eventDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
