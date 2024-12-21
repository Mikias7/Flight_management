/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

public class InternationalFlight extends Flight {
    
    // Constructor to initialize an InternationalFlight object, passing values to the superclass (Flight)
    public InternationalFlight(String flightNumber, String date, String origin, String originState,
                               String destination, String destinationState, String airline,
                               String departureTime, String arrivalTime) {
        super(flightNumber, date, origin, originState, destination, destinationState, airline, departureTime, arrivalTime);
    }

    // Method to indicate that baggage is allowed for international flights
    @Override
    public boolean isBaggageAllowed() { return true; }
    
    // Method to return the flight details in a string format
    @Override
    public String getDetails() {
        return "International Flight: " + getFlightNumber() + " from " + getOrigin() + " to " + getDestination() + " on " + getDate() + ": Baggage Allowed: " + isBaggageAllowed();
    }
}
