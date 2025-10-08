import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {

        System.out.println("Trying substring with wrong indexes...");
        String sub = text.substring(5, 2); 
        System.out.println("Substring: " + sub);
    }

    public static void handleException(String text) {
        try {
            System.out.println("Trying substring with wrong indexes...");
            String sub = text.substring(5, 2); 
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: IllegalArgumentException -> " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        handleException(text);

        sc.close();
    }
}
