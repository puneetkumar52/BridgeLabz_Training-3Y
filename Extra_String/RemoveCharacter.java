package Extra_String;
import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        String res = "";
        for (char c : str.toCharArray()) {
            if (c != ch) res += c;
        }
        System.out.println("Modified String: " + res);
    }
}
