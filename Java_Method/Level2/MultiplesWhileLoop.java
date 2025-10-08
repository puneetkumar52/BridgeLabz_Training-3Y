package Java_core.Level2;

import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 1;
            while (counter * number < 100) {
                System.out.print((counter * number) + " ");
                counter++;
            }
        } else {
            System.out.println("Please enter a valid positive integer less than 100.");
        }
    }
}
