package org.example;

public class Largest {

    // Function to find the largest element in an array
    public static int findLargest(int[] array) {
        // Assume the first element is the largest initially
        int largest = array[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // If current element is larger, update the largest variable
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        // Example input array
        int[] array = {3, 7, 2, 8, 1};

        // Find the largest element in the array
        int largestElement = findLargest(array);

        // Print the result
        System.out.println("The largest element in the array is: " + largestElement);
    }
}

