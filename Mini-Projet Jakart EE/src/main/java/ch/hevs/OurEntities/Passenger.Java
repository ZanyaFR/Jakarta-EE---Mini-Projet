package main.java.ch.hevs.OurEntities;

public class Passenger {
    private int passengerID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int flightID;

    // Getter and Setters
    public int getPassengerID() { return passengerID; }
    public void setPassengerID(int passengerID) {this.passengerID = passengerID; }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber;}

    public int getFlightID() { return flightID;}
    public void setFlightID(int flightID) { this.flightID = flightID;}
}
