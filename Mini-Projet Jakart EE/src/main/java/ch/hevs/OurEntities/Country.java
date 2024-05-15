package ch.hevs.OurEntities;

public abstract class Country{
    private int countryID;
    private String City;
    private String Name;
    private String airportCode;


    public int getCountryID() { return countryID; }
    public void setCountryID(int countryID) { this.countryID = countryID; }

    public String getCity() { return City; }
    public void setCity(String city) { City = city; }

    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

    public String getAirportCode() { return airportCode; }
    public void setAirportCode(String airportCode) { this.airportCode = airportCode; }
}