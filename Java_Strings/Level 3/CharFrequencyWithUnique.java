import java.util.Scanner;

public class CharFrequencyWithUnique {


    public static char[] findUniqueChars(String text) {
        int n = text.length();
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

    
    public static String[][] findFrequencies(String text) {
        int[] freq = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

     
        char[] uniqueChars = findUniqueChars(text);

      
        String[][] result = new String[uniqueChars.length][2];

       
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(freq[c]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencies = findFrequencies(text);

        System.out.println("\nCharacter Frequencies:");
        System.out.println("Char\tFrequency");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + "\t" + frequencies[i][1]);
        }

        sc.close();
    }
}

