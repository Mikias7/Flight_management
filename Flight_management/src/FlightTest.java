/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

import edu.augie.finalProgram.tadele.*;

public class FlightTest {
    public static void main(String[] args) {
        // Create instances of DomesticFlight 
        Flight flight1 = new DomesticFlight("AA123", "2024-12-20", "ATL", "GA", "PHX", "AR", "Delta Airlines", "10:00 AM", "11:30 AM");
        Flight flight2 = new DomesticFlight("AA456", "2024-12-21", "ORD", "IL", "DFW", "TX", "United Airlines", "2:00 PM", "5:00 PM");
        // Create instances of InternationalFlight 
        Flight flight3 = new InternationalFlight("BL789", "2024-12-22", "DOH", "Qatar", "JNB", "South Africa", "Qatar Airlines", "6:00 AM", "10:00 AM");

        // Test toString() method
        System.out.println("Flight Details (toString):");
        System.out.println(flight1.toString());
        System.out.println(flight2.toString());
        System.out.println(flight3.toString());

        // Test compareTo() method by comparing two flights
        System.out.println("\nComparing Flights by Date:");
        System.out.println("flight1 compared to flight2: " + flight1.compareTo(flight2)); // Should print a negative number since flight1 is earlier
        System.out.println("flight2 compared to flight3: " + flight2.compareTo(flight3)); // Should print a negative number since flight2 is earlier
        System.out.println("flight3 compared to flight1: " + flight3.compareTo(flight1)); // Should print a positive number since flight3 is later

        // Test getDetails() method for polymorphic behavior
        System.out.println("\nFlight Details (getDetails):");
        System.out.println(flight1.getDetails());
        System.out.println(flight2.getDetails());
        System.out.println(flight3.getDetails());
    }
}