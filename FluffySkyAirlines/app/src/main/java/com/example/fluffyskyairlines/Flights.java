package com.example.fluffyskyairlines;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Flights {

    public static void main(String[] args) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference flightsRef = database.getReference("flights");

        // Assuming you have a Flight model
        uploadFlight(flightsRef, 1, "2024-01-01", "10:00:00", 10);
        uploadFlight(flightsRef, 2, "2024-01-01", "14:00:00", 10);
        uploadFlight(flightsRef, 3, "2024-01-01", "18:00:00", 10);
        uploadFlight(flightsRef, 4, "2024-01-02", "10:00:00", 10);
        uploadFlight(flightsRef, 5, "2024-01-02", "14:00:00", 10);
        uploadFlight(flightsRef, 6, "2024-01-02", "18:00:00", 10);
        uploadFlight(flightsRef, 7, "2024-01-03", "10:00:00", 10);
        uploadFlight(flightsRef, 8, "2024-01-03", "14:00:00", 10);
        uploadFlight(flightsRef, 9, "2024-01-03", "18:00:00", 10);
        uploadFlight(flightsRef, 10, "2024-01-04", "10:00:00", 10);
        uploadFlight(flightsRef, 11, "2024-01-04", "14:00:00", 10);
        uploadFlight(flightsRef, 12, "2024-01-04", "18:00:00", 10);
        uploadFlight(flightsRef, 13, "2024-01-05", "10:00:00", 10);
        uploadFlight(flightsRef, 14, "2024-01-05", "14:00:00", 10);
        uploadFlight(flightsRef, 15, "2024-01-05", "18:00:00", 10);
        uploadFlight(flightsRef, 16, "2024-01-06", "10:00:00", 10);
        uploadFlight(flightsRef, 17, "2024-01-06", "14:00:00", 10);
        uploadFlight(flightsRef, 18, "2024-01-06", "18:00:00", 10);
        uploadFlight(flightsRef, 19, "2024-01-07", "10:00:00", 10);
        uploadFlight(flightsRef, 20, "2024-01-07", "14:00:00", 10);
        uploadFlight(flightsRef, 21, "2024-01-07", "18:00:00", 10);
        uploadFlight(flightsRef, 22, "2024-01-08", "10:00:00", 10);
        uploadFlight(flightsRef, 23, "2024-01-08", "14:00:00", 10);
        uploadFlight(flightsRef, 24, "2024-01-08", "18:00:00", 10);
        uploadFlight(flightsRef, 25, "2024-01-09", "10:00:00", 10);
        uploadFlight(flightsRef, 26, "2024-01-09", "14:00:00", 10);
        uploadFlight(flightsRef, 27, "2024-01-09", "18:00:00", 10);
        uploadFlight(flightsRef, 28, "2024-01-10", "10:00:00", 10);
        uploadFlight(flightsRef, 29, "2024-01-10", "14:00:00", 10);
        uploadFlight(flightsRef, 30, "2024-01-10", "18:00:00", 10);
        uploadFlight(flightsRef, 31, "2024-01-11", "10:00:00", 10);
        uploadFlight(flightsRef, 32, "2024-01-11", "14:00:00", 10);
        uploadFlight(flightsRef, 33, "2024-01-11", "18:00:00", 10);
        uploadFlight(flightsRef, 34, "2024-01-12", "10:00:00", 10);
        uploadFlight(flightsRef, 35, "2024-01-12", "14:00:00", 10);
        uploadFlight(flightsRef, 36, "2024-01-12", "18:00:00", 10);
        uploadFlight(flightsRef, 37, "2024-01-13", "10:00:00", 10);
        uploadFlight(flightsRef, 38, "2024-01-13", "14:00:00", 10);
        uploadFlight(flightsRef, 39, "2024-01-13", "18:00:00", 10);
        uploadFlight(flightsRef, 40, "2024-01-14", "10:00:00", 10);
        uploadFlight(flightsRef, 41, "2024-01-14", "14:00:00", 10);
        uploadFlight(flightsRef, 42, "2024-01-14", "18:00:00", 10);
        uploadFlight(flightsRef, 43, "2024-01-15", "10:00:00", 10);
        uploadFlight(flightsRef, 44, "2024-01-15", "14:00:00", 10);
        uploadFlight(flightsRef, 45, "2024-01-15", "18:00:00", 10);
        uploadFlight(flightsRef, 46, "2024-01-16", "10:00:00", 10);
        uploadFlight(flightsRef, 47, "2024-01-16", "14:00:00", 10);
        uploadFlight(flightsRef, 48, "2024-01-16", "18:00:00", 10);
        uploadFlight(flightsRef, 49, "2024-01-17", "10:00:00", 10);
        uploadFlight(flightsRef, 50, "2024-01-17", "14:00:00", 10);
        uploadFlight(flightsRef, 51, "2024-01-17", "18:00:00", 10);
        uploadFlight(flightsRef, 52, "2024-01-18", "10:00:00", 10);
        uploadFlight(flightsRef, 53, "2024-01-18", "14:00:00", 10);
        uploadFlight(flightsRef, 54, "2024-01-18", "18:00:00", 10);
        uploadFlight(flightsRef, 55, "2024-01-19", "10:00:00", 10);
        uploadFlight(flightsRef, 56, "2024-01-19", "14:00:00", 10);
        uploadFlight(flightsRef, 57, "2024-01-19", "18:00:00", 10);
        uploadFlight(flightsRef, 58, "2024-01-20", "10:00:00", 10);
        uploadFlight(flightsRef, 59, "2024-01-20", "14:00:00", 10);
        uploadFlight(flightsRef, 60, "2024-01-20", "18:00:00", 10);
        uploadFlight(flightsRef, 61, "2024-01-21", "10:00:00", 10);
        uploadFlight(flightsRef, 62, "2024-01-21", "14:00:00", 10);
        uploadFlight(flightsRef, 63, "2024-01-21", "18:00:00", 10);
        uploadFlight(flightsRef, 64, "2024-01-22", "10:00:00", 10);
        uploadFlight(flightsRef, 65, "2024-01-22", "14:00:00", 10);
        uploadFlight(flightsRef, 66, "2024-01-22", "18:00:00", 10);
        uploadFlight(flightsRef, 67, "2024-01-23", "10:00:00", 10);
        uploadFlight(flightsRef, 68, "2024-01-23", "14:00:00", 10);
        uploadFlight(flightsRef, 69, "2024-01-23", "18:00:00", 10);
        uploadFlight(flightsRef, 70, "2024-01-24", "10:00:00", 10);
        uploadFlight(flightsRef, 71, "2024-01-24", "14:00:00", 10);
        uploadFlight(flightsRef, 72, "2024-01-24", "18:00:00", 10);
        uploadFlight(flightsRef, 73, "2024-01-25", "10:00:00", 10);
        uploadFlight(flightsRef, 74, "2024-01-25", "14:00:00", 10);
        uploadFlight(flightsRef, 75, "2024-01-25", "18:00:00", 10);
        uploadFlight(flightsRef, 76, "2024-01-26", "10:00:00", 10);
        uploadFlight(flightsRef, 77, "2024-01-26", "14:00:00", 10);
        uploadFlight(flightsRef, 78, "2024-01-26", "18:00:00", 10);
        uploadFlight(flightsRef, 79, "2024-01-27", "10:00:00", 10);
        uploadFlight(flightsRef, 80, "2024-01-27", "14:00:00", 10);
        uploadFlight(flightsRef, 81, "2024-01-27", "18:00:00", 10);
        uploadFlight(flightsRef, 82, "2024-01-28", "10:00:00", 10);
        uploadFlight(flightsRef, 83, "2024-01-28", "14:00:00", 10);
        uploadFlight(flightsRef, 84, "2024-01-28", "18:00:00", 10);
        uploadFlight(flightsRef, 85, "2024-01-29", "10:00:00", 10);
        uploadFlight(flightsRef, 86, "2024-01-29", "14:00:00", 10);
        uploadFlight(flightsRef, 87, "2024-01-29", "18:00:00", 10);
        uploadFlight(flightsRef, 88, "2024-01-30", "10:00:00", 10);
        uploadFlight(flightsRef, 89, "2024-01-30", "14:00:00", 10);
        uploadFlight(flightsRef, 90, "2024-01-30", "18:00:00", 10);
        uploadFlight(flightsRef, 91, "2024-01-31", "10:00:00", 10);
        uploadFlight(flightsRef, 92, "2024-01-31", "14:00:00", 10);
        uploadFlight(flightsRef, 93, "2024-01-31", "18:00:00", 10);
    }

    private static void uploadFlight(DatabaseReference flightsRef, int flightID, String flightDate, String flightTime, int availableSeats) {
        Flight flight = new Flight(flightID, flightDate, flightTime, availableSeats);
        flightsRef.child(String.valueOf(flightID)).setValue(flight);
    }
}

class Flight {
    private int flightID;
    private String flightDate;
    private String flightTime;
    private int availableSeats;

    // Default constructor (required for Firebase)
    public Flight() {
        // Default constructor required for calls to DataSnapshot.getValue(Flight.class)
    }

    // Parameterized constructor
    public Flight(int flightID, String flightDate, String flightTime, int availableSeats) {
        this.flightID = flightID;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.availableSeats = availableSeats;
    }

    // Getter and Setter methods
    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
