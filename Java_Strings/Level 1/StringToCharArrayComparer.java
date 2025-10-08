import java.util.Scanner;

public class StringToCharArrayComparer {


    public char[] manualToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i); 
        }
        return chars;
    }

    public boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringToCharArrayComparer comparer = new StringToCharArrayComparer();

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualChars = comparer.manualToCharArray(text);

        char[] builtInChars = text.toCharArray();

        boolean areEqual = comparer.compareCharArrays(manualChars, builtInChars);

        System.out.println("\nManual char array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in char array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both char arrays equal? " + areEqual);

        sc.close();
    }
}
