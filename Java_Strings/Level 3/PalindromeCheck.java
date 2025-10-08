import java.util.Scanner;

public class PalindromeCheck {

  
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

   
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; 
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

   
    public static char[] reverseString(String text) {
        int n = text.length();
        char[] rev = new char[n];
        for (int i = 0; i < n; i++) {
            rev[i] = text.charAt(n - 1 - i);
        }
        return rev;
    }

    
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        if (original.length != reversed.length) {
            return false;
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        
        boolean iterativeResult = isPalindromeIterative(text);
        System.out.println("\nLogic 1 (Iterative): " + (iterativeResult ? "Palindrome" : "Not Palindrome"));

        
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Logic 2 (Recursive): " + (recursiveResult ? "Palindrome" : "Not Palindrome"));

        
        boolean arrayResult = isPalindromeArray(text);
        System.out.println("Logic 3 (Char Array): " + (arrayResult ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}

