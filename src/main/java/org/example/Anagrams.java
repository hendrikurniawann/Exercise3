package org.example;

import java.util.Arrays;

public class Anagrams {

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase for case insensitivity
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Example inputs
        String input1 = "listen";
        String input2 = "silent";

        // Check if the inputs are anagrams
        boolean result = areAnagrams(input1, input2);
        System.out.println("Are \"" + input1 + "\" and \"" + input2 + "\" anagrams? " + result);

        // Additional example
        String input3 = "hello";
        String input4 = "world";

        // Check if the additional inputs are anagrams
        boolean result2 = areAnagrams(input3, input4);
        System.out.println("Are \"" + input3 + "\" and \"" + input4 + "\" anagrams? " + result2);
    }
}

