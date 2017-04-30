package com.example.android.quakereport;

public class Earthquake {

    private String magnitude;
    private String eventLocation;
    private String eventDate;

    public Earthquake(String magnitude, String eventLocation, String eventDate) {
        setMagnitude(magnitude);
        setEventLocation(eventLocation);
        setEventDate(eventDate);
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
}
