/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

import edu.augie.finalProgram.tadele.*;

import java.util.ArrayList;

public class FlightDataTest {
    public static void main(String[] args) {
        // Assuming the file 'flights.csv' exists with the correct structure
        FlightData flightData = new FlightData();

        // Test with domestic flights
        ArrayList<Flight> domesticFlights = flightData.createFlight("domestic_flight.csv", true);
        System.out.println("Domestic Flights:");
        // Use a for loop that iterates up to 5 times
        for (int i = 0; i < 5 && i < domesticFlights.size(); i++) {
            System.out.println(domesticFlights.get(i).getDetails());
        }

        // Test with international flights
        ArrayList<Flight> internationalFlights = flightData.createFlight("international_flight.csv", false);
        System.out.println("\nInternational Flights:");
        // Use a for loop that iterates up to 5 times
        for (int i = 0; i < 5 && i < internationalFlights.size(); i++) {
            System.out.println(internationalFlights.get(i).getDetails());
        }
    }
}
