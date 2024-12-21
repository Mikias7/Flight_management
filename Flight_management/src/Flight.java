/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

public abstract class Flight implements Comparable<Flight> {
    private String flightNumber;
    private String date;
    private String origin;
    private String originState;
    private String destination;
    private String destinationState;
    private String airline;
    private String departureTime;
    private String arrivalTime;

    // Constructor to initialize flight details
    public Flight(String flightNumber, String date, String origin, String originState,
                  String destination, String destinationState, String airline,
                  String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.date = date;
        this.origin = origin;
        this.originState = originState;
        this.destination = destination;
        this.destinationState = destinationState;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Default constructor
    public Flight() {}

    // Getters for all flight details
    public String getFlightNumber() { return flightNumber; }
    public String getDate() { return date; }
    public String getOrigin() { return origin; }
    public String getOriginState() { return originState; }
    public String getDestination() { return destination; }
    public String getDestinationState() { return destinationState; }
    public String getAirline() { return airline; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }

    // Compare flights based on date using DateConverter to convert the date to float
    @Override
    public int compareTo(Flight other) {
        return Float.compare(DateConverter.convertDateToFloat(this.date), DateConverter.convertDateToFloat(other.date));
    }

    // Return a string representation of the flight in CSV format
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                flightNumber, date, origin, originState, destination, destinationState, airline, departureTime, arrivalTime);
    }

    // Abstract methods that subclasses must implement
    public abstract String getDetails();  // Polymorphic behavior for getting flight details
    public abstract boolean isBaggageAllowed(); // Polymorphic behavior for baggage policy
}
