package com.example.android.quakereport;

public class Earthquake {

    private double magnitude;
    private String eventLocation;
    private long eventDate;

    public Earthquake(double magnitude, String eventLocation, long eventDate) {
        setMagnitude(magnitude);
        setEventLocation(eventLocation);
        setEventDate(eventDate);
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
}
