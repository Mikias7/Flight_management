/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

import edu.augie.finalProgram.tadele.*;

public class DomesticFlightTest {
    public static void main(String[] args) {
        // Create instances of DomesticFlight
        DomesticFlight flight1 = new DomesticFlight("AA123", "2024-12-15", "ATL", "GA", "ORD", "IL", "Delta Airlines", "10:00 AM", "11:30 AM");
        DomesticFlight flight2 = new DomesticFlight("AA456", "2024-12-16", "ORD", "IL", "DFW", "TX", "United Airlines", "2:00 PM", "5:00 PM");
        DomesticFlight flight3 = new DomesticFlight("AA789", "2024-12-17", "DFW", "TX", "JFK", "NY", "American Airlines", "6:00 AM", "10:00 AM");

        // Print details of each flight
        System.out.println("Flight Details:");
        System.out.println(flight1.getDetails());
        System.out.println(flight2.getDetails());
        System.out.println(flight3.getDetails());

        // Test baggage allowance
        System.out.println("\nBaggage Allowed Check:");
        System.out.println("Flight " + flight1.getFlightNumber() + ": " + flight1.isBaggageAllowed());
        System.out.println("Flight " + flight2.getFlightNumber() + ": " + flight2.isBaggageAllowed());
        System.out.println("Flight " + flight3.getFlightNumber() + ": " + flight3.isBaggageAllowed());
    }
}
