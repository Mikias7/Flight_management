/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

import java.util.Arrays;

public class Airport implements AirportData {

    // Attributes for the airport and its destination list
    String originAirport;
    String[] destinationList;

    // Constructor: Initializes the airport and sets its destination list
    public Airport(String originAirport) {
        this.originAirport = originAirport;
        this.destinationList = getDestinationsForOrigin(originAirport);
    }

    // Getter for the origin airport
    public String getOriginAirport() {
        return originAirport;
    }

    // Getter for the destination list
    public String[] getDestinationList() {
        return destinationList;
    }

    // toString: Returns a string representation of the airport and its destinations
    @Override
    public String toString() {
        return String.format("%s -> %s", originAirport, String.join(", ", destinationList));
    }

    // Method to get destinations for a given origin airport
    public String[] getDestinationsForOrigin(String originAirport) {
        if (INTERNATIONAL_AIRPORTS.contains(originAirport)) {
            // If the airport is international, return international destinations
            return INTERNATIONAL_FLIGHTS.getOrDefault(originAirport, Arrays.asList()).toArray(new String[0]);
        } else if (DOMESTIC_AIRPORTS.contains(originAirport)) {
            // If the airport is domestic, return domestic destinations
            return DOMESTIC_FLIGHTS.getOrDefault(originAirport, Arrays.asList()).toArray(new String[0]);
        } else {
            // If the airport is not found in either list, return empty array
            return new String[0];
        }
    }

    // Method to check if the airport has international flights
    public boolean hasInternationalFlights() {
        return INTERNATIONAL_AIRPORTS.contains(originAirport);
    }

    // Method to check if the airport has domestic flights
    public boolean hasDomesticFlights() {
        return DOMESTIC_AIRPORTS.contains(originAirport);
    }

}
