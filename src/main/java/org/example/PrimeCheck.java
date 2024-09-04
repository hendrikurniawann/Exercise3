package org.example;

public class PrimeCheck {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Other even numbers are not prime
        }

        // Check divisibility from 3 up to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        int number1 = 17;
        int number2 = 4;

        System.out.println(number1 + " is prime: " + isPrime(number1)); // Output: true
        System.out.println(number2 + " is prime: " + isPrime(number2)); // Output: false
    }
}

