import java.util.Scanner;

public class NumberFormatDemo {

    // (c) Method to generate the Exception (no handling)
    public static void generateException(String text) {
        System.out.println("Trying to parse string into integer...");
        int number = Integer.parseInt(text); // if text is not numeric, this crashes
        System.out.println("Converted number: " + number);
    }

    // (d) Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Trying to parse string into integer...");
            int number = Integer.parseInt(text); // may throw exception
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: NumberFormatException -> " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    // (e) Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (a) Take user input as String
        System.out.print("Enter a number (or non-number to see exception): ");
        String text = sc.nextLine();

        handleException(text);

        sc.close();
    }
}
