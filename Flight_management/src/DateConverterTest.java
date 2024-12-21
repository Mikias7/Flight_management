/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */


import edu.augie.finalProgram.tadele.*;

public class DateConverterTest {
    public static void main(String[] args) {
        // Test valid dates
        System.out.println(DateConverter.convertDateToFloat("2024-12-12"));  // Output: 12.12
        System.out.println(DateConverter.convertDateToFloat("2024-02-24"));  // Output: 2.29 (Leap year)

        // Test invalid dates
        try {
            System.out.println(DateConverter.convertDateToFloat("2024-13-12"));  // Invalid month
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Invalid month. Month must be between 01 and 12.
        }

        try {
            System.out.println(DateConverter.convertDateToFloat("2024-12-32"));  // Invalid day
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Invalid day. Day must be between 01 and 31 for the given month.
        }

        try {
            System.out.println(DateConverter.convertDateToFloat("12-12-2024"));  // Invalid format
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Invalid date format. Expected yyyy-MM-dd.
        }

        try {
            System.out.println(DateConverter.convertDateToFloat(null));  // Null input
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Invalid date format. Expected yyyy-MM-dd.
        }
    }
}
