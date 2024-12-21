/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

import edu.augie.finalProgram.tadele.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("------------------------------------------------------------");
        System.out.println("Welcome to Flight Search!");
        System.out.println("------------------------------------------------------------");

        // Prompt for flight type (domestic or international)
        System.out.print("Do you want domestic or international flights? (Enter 'd' or 'i'): ");
        String flightType = scanner.nextLine().toLowerCase();

        // Determine file and flight type based on user input
        String fileName = "";
        boolean isDomestic = false;

        if (flightType.equals("d")) {
            fileName = "domestic_flight.csv";
            isDomestic = true;
        } else if (flightType.equals("i")) {
            fileName = "international_flight.csv";
            isDomestic = false;
        } else {
            System.out.println("Invalid flight type.");
            scanner.close();
            return;
        }

        // Create flight data and list based on the chosen flight type
        FlightData flightData = new FlightData();
        ArrayList<Flight> flightList = flightData.createFlight(fileName, isDomestic);

        // Menu options loop
        int choice;
        boolean continueProgram = true;
        do {
            // Display the menu options
            System.out.println("\n------------------------------------------------------------");
            System.out.println("Flight Search Menu:");
            System.out.println("------------------------------------------------------------");
            System.out.println("1. Check available " + (isDomestic ? "domestic" : "international") + " airports");
            System.out.println("2. Check where you can fly from your origin airport");
            System.out.println("3. Check all available flights on a certain date");
            System.out.println("4. Search for flights based on origin, destination, and date");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Switch statement for each menu option
            switch (choice) {
                case 1:
                    checkAvailableAirports(isDomestic);  // Check available airports
                    break;
                case 2:
                    checkDestinations(scanner);  // Check destinations from origin
                    break;
                case 3:
                    checkFlightsByDate(scanner, flightList);  // Check flights by date
                    break;
                case 4:
                    searchFlights(scanner, flightList);  // Search flights based on user criteria
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-4).");
                    break;
            }

            // Ask if the user wants to continue or exit
            System.out.println("------------------------------------------------------------");
            System.out.println("Enter 6 to continue or 5 to exit.");
            int userChoice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            if (userChoice == 5) {
                continueProgram = false;
                System.out.println("------------------------------------------------------------");
                System.out.println("Exiting the program.");
                System.out.println("------------------------------------------------------------");
            } else if (userChoice != 6) {
                System.out.println("Invalid input. Please enter 5 to exit or 6 to continue.");
            }

        } while (continueProgram);  // Continue until the user chooses to exit

        scanner.close();
    }

    // Method to check available airports (domestic or international)
    public static void checkAvailableAirports(boolean isDomestic) {
        System.out.println("\n------------------------------------------------------------");
        System.out.println((isDomestic ? "Domestic" : "International") + " Airports:");
        System.out.println("------------------------------------------------------------");
        if (isDomestic) {
            // Loop through and display domestic airports
            for (String airport : AirportData.DOMESTIC_AIRPORTS) {
                System.out.print(airport + " | ");
            }
        } else {
            // Loop through and display international airports
            for (String airport : AirportData.INTERNATIONAL_AIRPORTS) {
                System.out.print(airport + " | ");
            }
        }
        System.out.println("\n------------------------------------------------------------");
    }

    // Method to check destinations from a specific origin airport
    public static void checkDestinations(Scanner scanner) {
        System.out.print("\nEnter origin airport: ");
        String origin = scanner.nextLine();

        Airport airport1 = new Airport(origin);
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Origin: " + airport1.getOriginAirport() + 
                " flies to: " + String.join(", ", airport1.getDestinationList()));
        System.out.println("------------------------------------------------------------");
    }

    // Method to check flights on a specific date
    public static void checkFlightsByDate(Scanner scanner, ArrayList<Flight> flightList) {
        System.out.print("\nEnter date (yyyy-MM-dd): ");
        String date1 = scanner.nextLine();

        System.out.print("Enter origin airport: ");
        String origin1 = scanner.nextLine();

        // Filter flights by origin
        ArrayList<Flight> filteredFlights = (ArrayList<Flight>) flightList.stream()
                .filter(f -> f.getOrigin().equals(origin1))
                .collect(Collectors.toList());

        // Create a binary tree to store filtered flights
        BinaryTree<Flight> flightTree1 = new BinaryTree<>();
        for (Flight flight : filteredFlights) {
            flightTree1.insert(flight);
        }

        // Search for flights matching the date
        System.out.println("Searching for flights on date: " + date1);
        flightTree1.search(flightTree1.root, date1);
    }

    // Method to search flights based on origin, destination, and date
    public static void searchFlights(Scanner scanner, ArrayList<Flight> flightList) {
        System.out.print("\nEnter origin airport: ");
        String origin2 = scanner.nextLine();
        System.out.print("Enter destination airport: ");
        String destination = scanner.nextLine();
        System.out.print("Enter date (yyyy-MM-dd): ");
        String date = scanner.nextLine();
        System.out.println(" ");

        // Filter flights based on user input
        ArrayList<Flight> filteredFlights2 = (ArrayList<Flight>) flightList.stream()
                .filter(f -> f.getOrigin().equals(origin2) && f.getDestination().equals(destination))
                .collect(Collectors.toList());

        // Create a binary tree for filtered flights
        BinaryTree<Flight> flightTree2 = new BinaryTree<>();
        for (Flight flight : filteredFlights2) {
            flightTree2.insert(flight);
        }

        // Search for flights matching the criteria
        System.out.println("Searching for flights on date: " + date);
        flightTree2.search(flightTree2.root, date);
    }
}
