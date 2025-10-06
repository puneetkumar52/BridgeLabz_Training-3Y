package Extras;

import java.util.Scanner;

public class MaxOfThreeNumbers {

    // Function to take integer input from user
    public static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to calculate maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");
        int num3 = getInput(sc, "Enter third number: ");

        // Calculating maximum
        int max = findMaximum(num1, num2, num3);

        // Display result
        System.out.println("The maximum of the three numbers is: " + max);

        sc.close();
    }
}

