package ch.hevs.OurEntities;

public class Flight {
    private int flightID;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private String origin;
    private String destination;
    private double price;
    private boolean isFull;
    private int destinationID;
    
    //getters, and setters

    public int getFlightID() {return flightID; }
    public void setFlightID(int flightID) { this.flightID = flightID;}
    
    public String getDepartureDate() {   return departureDate; }
    public void setDepartureDate(String departureDate) { this.departureDate = departureDate;}
    
    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) {this.departureTime = departureTime;}
    
    public String getArrivalDate() { return arrivalDate;}
    public void setArrivalDate(String arrivalDate) { this.arrivalDate = arrivalDate; }
    
    public String getArrivalTime() { return arrivalTime;}
    public void setArrivalTime(String arrivalTime) {this.arrivalTime = arrivalTime;}
    
    public String getOrigin() { return origin;}
    public void setOrigin(String origin) {this.origin = origin;  }
    
    public String getDestination() { return destination; }
    public void setDestination(String destination) {this.destination = destination;}
    
    public double getPrice() { return price; }
    public void setPrice(double price) {this.price = price;}
    
    public boolean isFull() { return isFull;}
    public void setFull(boolean isFull) {this.isFull = isFull;}
    
    public int getDestinationID() {return destinationID;}
    public void setDestinationID(int destinationID) {this.destinationID = destinationID;}
    
}
