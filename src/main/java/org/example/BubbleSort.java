package org.example;

public class BubbleSort {

    // Function to sort an array using bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Print the array before sorting
        System.out.println("Array before sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array
        bubbleSort(array);

        // Print the array after sorting
        System.out.println("Array after sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

