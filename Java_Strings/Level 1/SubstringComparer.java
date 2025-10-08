import java.util.Scanner;

public class SubstringComparer {

    public String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i); 
        }
        return result;
    }
    public boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SubstringComparer comparer = new SubstringComparer();

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = comparer.manualSubstring(text, start, end);

        String builtInSub = text.substring(start, end);

        boolean areEqual = comparer.compareStrings(manualSub, builtInSub);

        System.out.println("\nManual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);

        sc.close();
    }
}

