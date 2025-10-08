import java.util.Scanner;

public class StringSplitDemo {

    // (b) Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] manualSplit(String text) {
        int n = findLength(text);

        int wordCount = 1; 
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int wIndex = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[wIndex++] = text.substring(start, end);
            start = end + 1; 
        }
        words[wIndex] = text.substring(start, n);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manualWords = manualSplit(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(manualWords, builtInWords);

        System.out.println("\nManual split result:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
