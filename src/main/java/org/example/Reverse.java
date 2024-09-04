package org.example;

public class Reverse {

    // Function to reverse a string
    public static String reverseString(String input) {
        // Convert the input string to a character array
        char[] characters = input.toCharArray();

        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = characters.length - 1;

        // Swap characters from start to end until the pointers meet
        while (start < end) {
            // Swap characters at start and end positions
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            // Move pointers towards the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(characters);
    }

    public static void main(String[] args) {
        // Example input
        String input = "hello";

        // Reverse the string
        String reversed = reverseString(input);

        // Print the result
        System.out.println("Reversed string: " + reversed);
    }
}

