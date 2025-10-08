import java.util.Scanner;

public class ArrayIndexDemo {

    // (b) Method to generate the Exception (without handling)
    public static void generateException(String[] names) {
        System.out.println("Accessing index beyond array length...");
        // Trying to access index larger than length
        System.out.println("Name at invalid index: " + names[names.length]); 
        // last valid index is names.length - 1
    }

    // (c) Method to handle the Exception with try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index beyond array length...");
            System.out.println("Name at invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException -> " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        handleException(names);

        sc.close();
    }
}
