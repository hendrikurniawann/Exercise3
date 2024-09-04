package org.example;

public class SecondSmallest {

    // Function to find the second smallest element in an array
    public static int findSecondSmallest(int[] array) {
        // Handle edge cases
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        // Initialize the smallest and second smallest with maximum possible values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array to find the smallest and second smallest elements
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = num; // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num; // Update second smallest
            }
        }

        // Check if second smallest was updated
        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("No second smallest element found (all elements may be the same).");
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        // Example input
        int[] array = {5, 3, 8, 1, 2, 9};

        // Find the second smallest element
        try {
            int secondSmallest = findSecondSmallest(array);
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

