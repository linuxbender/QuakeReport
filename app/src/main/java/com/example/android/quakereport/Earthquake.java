package com.example.android.quakereport;

public class Earthquake {

    private String magnitude;
    private String eventLocation;
    private long eventDate;

    public Earthquake(String magnitude, String eventLocation, long eventDate) {
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

    public long getEventDate() {
        return eventDate;
    }

    public void setEventDate(long eventDate) {
        this.eventDate = eventDate;
    }
}
