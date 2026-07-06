package com.example.tema14.model;

public class Room {

    private String type;
    private double sqm;
    private int noOfGuests;
    private boolean balcony;

    public Room(String type, double sqm, int noOfGuests, boolean balcony) {
        this.type = type;
        this.sqm = sqm;
        this.noOfGuests = noOfGuests;
        this.balcony = balcony;
    }

    public String getType() {
        return type;
    }

    public double getSqm() {
        return sqm;
    }

    public int getNoOfGuests() {
        return noOfGuests;
    }

    public boolean isBalcony() {
        return balcony;
    }
}