/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

import edu.augie.finalProgram.tadele.*;

public class InternationalFlightTest {
    public static void main(String[] args) {
        // Create instances of InternationalFlight
        InternationalFlight flight1 = new InternationalFlight("BA123", "2024-12-20", "LHR", "United Kingdom", "GRU", "Brazil", "British Airways", "8:00 AM", "11:00 AM");
        InternationalFlight flight2 = new InternationalFlight("AF456", "2024-12-21", "CDG", "France", "DEL", "India", "Air France", "10:00 AM", "1:00 PM");
        InternationalFlight flight3 = new InternationalFlight("LH789", "2024-12-22", "FRA", "Germany", "KUL", "Malaysia", "Lufthansa", "12:00 PM", "4:00 PM");

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
