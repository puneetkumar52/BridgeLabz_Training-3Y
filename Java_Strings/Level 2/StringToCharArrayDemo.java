import java.util.Scanner;

public class StringToCharArrayDemo {

    public static char[] manualToCharArray(String text) {
        int length = 0;

        try {
            while (true) {
                text.charAt(length); 
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manualChars = manualToCharArray(text);
        char[] builtInChars = text.toCharArray();

        boolean result = compareArrays(manualChars, builtInChars);

        System.out.println("\nManual toCharArray:");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nBuilt-in toCharArray:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both results same? " + result);

        sc.close();
    }
}
