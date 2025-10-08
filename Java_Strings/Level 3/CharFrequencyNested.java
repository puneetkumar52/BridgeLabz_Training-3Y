import java.util.Scanner;

public class CharFrequencyNested {

    
    public static String[] findFrequencies(String text) {
   
        char[] chars = text.toCharArray();
        int n = chars.length;

        int[] freq = new int[n];  

        
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') {  
                continue;
            }

            freq[i] = 1; 

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

       
        String[] result = new String[n];
        int resultCount = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[resultCount++] = chars[i] + " : " + freq[i];
            }
        }

      
        String[] finalResult = new String[resultCount];
        for (int i = 0; i < resultCount; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencies = findFrequencies(text);

        System.out.println("\nCharacter Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        sc.close();
    }
}
