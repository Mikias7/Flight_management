/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightData {

    // Creates a list of flights by reading data from a CSV file
    public ArrayList<Flight> createFlight(String fileName, boolean isDomestic) {
        String delimiter = ","; // Define delimiter for CSV
        ArrayList<Flight> flightList = new ArrayList<>(); // List to store flight objects

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Read and process the CSV file
            List<Flight> flights = br.lines().skip(1) // Skip the header line
                    .map(line -> {
                        String[] data = line.split(delimiter); // Split each line by delimiter
                        // If it's a domestic flight, create a DomesticFlight object
                        if (isDomestic) {
                            return new DomesticFlight(data[0].trim(), data[1].trim(), data[2].trim(),
                                                      data[3].trim(), data[4].trim(), data[5].trim(),
                                                      data[6].trim(), data[7].trim(), data[8].trim());
                        } else { // Otherwise, create an InternationalFlight object
                            return new InternationalFlight(data[0].trim(), data[1].trim(), data[2].trim(),
                                                           data[3].trim(), data[4].trim(), data[5].trim(),
                                                           data[6].trim(), data[7].trim(), data[8].trim());
                        }
                    })
                    .collect(Collectors.toList()); // Collect the flights into a list

            flightList.addAll(flights); // Add all the flights to the final list
        } catch (IOException e) {
            e.printStackTrace(); // Print any I/O errors
        }

        return flightList; // Return the list of flights
    }
}
