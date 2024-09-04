package org.example;

public class Fibonacci {

    // Function to generate the Fibonacci sequence up to n terms
    public static void generateFibonacci(int n) {
        // Handle edge cases
        if (n <= 0) {
            System.out.println("Number of terms must be greater than 0.");
            return;
        }

        // Variables to store the first two Fibonacci numbers
        int a = 0;
        int b = 1;

        // Print the Fibonacci sequence
        System.out.print("Fibonacci sequence up to " + n + " terms: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            // Compute the next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        // Print a newline at the end
        System.out.println();
    }

    public static void main(String[] args) {
        // Example input
        int n = 6;

        // Generate and print the Fibonacci sequence
        generateFibonacci(n);
    }
}

