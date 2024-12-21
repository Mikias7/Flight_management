/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

public class DateConverter {

    // Convert date in yyyy-MM-dd format to a float representing month and day
    public static float convertDateToFloat(String date) {
        try {
            // Check if the date matches the expected format (yyyy-MM-dd)
            if (date != null && date.matches("\\d{4}-\\d{2}-\\d{2}")) {
                String[] parts = date.split("-"); // Split the date into year, month, and day
                int month = Integer.parseInt(parts[1]); // Parse the month
                int day = Integer.parseInt(parts[2]); // Parse the day
                // Return the date as a float with month and day (e.g., 3.05 for March 5th)
                return Float.parseFloat(month + "." + String.format("%02d", day));
            } else {
                // Throw exception if the date format is invalid
                throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd.");
            }
        } catch (NumberFormatException e) {
            // Handle invalid number format errors (e.g., non-numeric values)
            throw new IllegalArgumentException("Error parsing the date components. Ensure the date is in the correct format.", e);
        } catch (Exception e) {
            // Handle unexpected errors during date conversion
            throw new IllegalArgumentException("An unexpected error occurred during date conversion.", e);
        }
    }
}
