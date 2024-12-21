/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

import edu.augie.finalProgram.tadele.*;

import java.util.Arrays;

public class AirportTest {
    public static void main(String[] args) {
        // Test case 1: Airport with international flights
        Airport internationalAirport = new Airport("DOH");
        System.out.println("Test 1: International Airport");
        System.out.println("Origin: " + internationalAirport.getOriginAirport());
        System.out.println("Destinations: " + Arrays.toString(internationalAirport.getDestinationList()));
        System.out.println("Has International Flights: " + internationalAirport.hasInternationalFlights());
        System.out.println("Has Domestic Flights: " + internationalAirport.hasDomesticFlights());
        System.out.println(internationalAirport);

        // Test case 2: Airport with domestic flights
        Airport domesticAirport = new Airport("LGA");
        System.out.println("\nTest 2: Domestic Airport");
        System.out.println("Origin: " + domesticAirport.getOriginAirport());
        System.out.println("Destinations: " + Arrays.toString(domesticAirport.getDestinationList()));
        System.out.println("Has International Flights: " + domesticAirport.hasInternationalFlights());
        System.out.println("Has Domestic Flights: " + domesticAirport.hasDomesticFlights());
        System.out.println(domesticAirport);

       
    }
}
