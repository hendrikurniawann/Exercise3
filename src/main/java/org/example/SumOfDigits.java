package org.example;

public class SumOfDigits {

    public static int SumOfDigits(int number) {
        int sum = 0;

        // Loop through each digit
        while (number != 0) {
            // Add the last digit to the sum
            sum += number % 10;
            // Remove the last digit
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 1234;
        int result = SumOfDigits(number);
        System.out.println("The sum of digits in " + number + " is " + result);
    }
}

