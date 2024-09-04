package org.example;

public class VowelCounter {

    // Function to count the number of vowels in a string
    public static int countVowels(String input) {
        // Convert the input string to lower case to handle case insensitivity
        input = input.toLowerCase();

        // Initialize a counter for vowels
        int count = 0;

        // Define a string containing all vowel characters
        String vowels = "aeiou";

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example input
        String input = "programming";

        // Count the vowels in the string
        int vowelCount = countVowels(input);

        // Print the result
        System.out.println("Number of vowels in \"" + input + "\" is: " + vowelCount);
    }
}

