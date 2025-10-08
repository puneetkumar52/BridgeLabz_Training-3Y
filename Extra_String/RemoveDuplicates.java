package Extra_String;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        String res = "";
        for (char c : str.toCharArray()) {
            if (res.indexOf(c) == -1) res += c;
        }
        System.out.println("Modified String: " + res);
    }
}
