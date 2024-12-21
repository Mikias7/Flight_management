/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

public class DomesticFlight extends Flight {

    // Constructor to initialize a domestic flight with the provided details
    public DomesticFlight(String flightNumber, String date, String origin, String originState,
                          String destination, String destinationState, String airline,
                          String departureTime, String arrivalTime) {
        // Call the superclass (Flight) constructor to initialize common flight details
        super(flightNumber, date, origin, originState, destination, destinationState, airline, departureTime, arrivalTime);
    }

    // Override the method to indicate that baggage is not allowed for domestic flights
    @Override
    public boolean isBaggageAllowed() { 
        return false; // Domestic flights do not allow baggage
    }

    // Override the method to provide the specific details of a domestic flight
    @Override
    public String getDetails() {
        // Return a formatted string with details of the domestic flight
        return "Domestic Flight: " + getFlightNumber() + " from " + getOrigin() + " to " + getDestination() + " on " + getDate() + ": Baggage Allowed: " + isBaggageAllowed();
    }
}
