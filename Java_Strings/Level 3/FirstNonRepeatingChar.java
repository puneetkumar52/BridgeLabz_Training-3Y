import java.util.Scanner;

public class FirstNonRepeatingChar {

    
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; 


        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

     
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] == 1) {
                return c; 
            }
        }

        return '\0'; 
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
