import java.util.Scanner;

public class UniqueCharacters {

   
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count); 
                count++;
            } catch (IndexOutOfBoundsException e) {
                break; 
            }
        }
        return count;
    }

    
    public static char[] findUniqueChars(String text) {
        int n = findLength(text);
        char[] unique = new char[n];  
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            
            for (int j = 0; j < i; j++) {
                if (c == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            
            if (isUnique) {
                unique[uniqueCount++] = c;
            }
        }

       
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueChars(text);

        System.out.println("\nUnique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
