/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

class Node<T> {
    T value;
    Node<T> left, right;

    // Constructor to initialize a new node
    public Node(T item) {
        value = item;
        left = right = null; // Set left and right children to null
    }
}

public class BinaryTree<T extends Comparable<T>> {
    public Node<T> root;

    // Constructor to initialize an empty binary tree
    public BinaryTree() {
        root = null;
    }

    // Public insert method to add a value to the tree
    public void insert(T value) {
        root = insertRec(root, value); // Insert value starting from the root
    }

    // Recursive method to insert a value into the tree
    private Node<T> insertRec(Node<T> root, T value) {
        if (root == null) {
            root = new Node<>(value); // Create a new node if root is null
            return root;
        }

        // Insert in the left subtree if the value is smaller or equal, else insert in the right
        if (value.compareTo(root.value) <= 0) {
            root.left = insertRec(root.left, value);
        } else {
            root.right = insertRec(root.right, value);
        }
        return root; // Return the root node after insertion
    }

    // Inorder traversal to print the tree in sorted order
    public void inorderTraversal(Node<T> node) {
        if (node != null) {
            inorderTraversal(node.left); // Visit the left subtree
            System.out.println(node.value); // Print the current node value
            inorderTraversal(node.right); // Visit the right subtree
        }
    }

    // Search for all flights matching a specific date
    public void search(Node<T> node, String targetDate) {
        if (node == null) {
            return; // Return if the node is null
        }

        Flight currentFlight = (Flight) node.value; // Cast the node value to a Flight object
        // Check if the current flight's date matches the target date
        if (currentFlight.getDate().equals(targetDate)) {
            System.out.println(currentFlight.getDetails()); // Print flight details if dates match
        }

        // Recursively search both left and right subtrees
        search(node.left, targetDate);
        search(node.right, targetDate);
    }
}
