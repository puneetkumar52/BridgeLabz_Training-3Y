package Extras;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess between low and high
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    public static String getFeedback(Scanner sc, int guess) {
        System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
        return sc.next().toLowerCase();
    }

    // Method to play the game
    public static void playGame() {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(sc, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number " + guess + " correctly!");
                found = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;  // adjust range downwards
            } else if (feedback.equals("low")) {
                low = guess + 1;   // adjust range upwards
            } else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!found) {
            System.out.println("Hmm... seems like there was a mistake in feedback. Let's try again!");
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}

