package Extras;

import java.util.Scanner;

public class FibonacciGenerator {

    // Function to generate and print Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Update values
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // move to next line after printing
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Generate sequence
        if (terms > 0) {
            generateFibonacci(terms);
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}

