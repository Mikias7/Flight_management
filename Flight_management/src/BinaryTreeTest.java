/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

import edu.augie.finalProgram.tadele.*;

public class BinaryTreeTest {
    public static void main(String[] args) {
        // Test BinaryTree with Integer values
        BinaryTree<Integer> intTree = new BinaryTree<>();
        System.out.println("Inserting elements into the binary tree:");
        intTree.insert(50);
        intTree.insert(30);
        intTree.insert(70);
        intTree.insert(20);
        intTree.insert(40);
        intTree.insert(60);
        intTree.insert(80);

        System.out.println("\nIn-order traversal of the binary tree:");
        intTree.inorderTraversal(intTree.root);

        // Test BinaryTree with Flight objects
        BinaryTree<Flight> flightTree = new BinaryTree<>();
        flightTree.insert(new DomesticFlight("NY123", "2024-12-12", "JFK", "NY", "LAX", "CA", "Delta", "10:00 AM", "1:00 PM"));
        flightTree.insert(new DomesticFlight("NY456", "2024-12-12", "ORD", "IL", "SEA", "WA", "United", "11:00 AM", "2:30 PM"));
        flightTree.insert(new DomesticFlight("NY789", "2024-12-13", "DFW", "TX", "PHX", "AR", "American Airlines", "9:00 AM", "12:00 PM"));

        System.out.println("\nSearching flights with date '2024-12-12':");
        flightTree.search(flightTree.root, "2024-12-12");

        System.out.println("\nSearching flights with date '2024-12-13':");
        flightTree.search(flightTree.root, "2024-12-13");
    }
}