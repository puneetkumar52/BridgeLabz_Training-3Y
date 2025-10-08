import java.util.*;

public class StringIndexDemo {
    
    public static void generateSIOOBE(String text) {
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    public static void handleSIOOBE(String text) {
        try {
            System.out.println(text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        handleSIOOBE(input);
    }
}
