
public class NullPointerDemo {

    public static void generateNPE() {
        String text = null;
        System.out.println(text.length()); 
    }

    public static void handleNPE() {
        try {
            String text = null;
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Variable is null");
        }
    }

    public static void main(String[] args) {
        handleNPE();      
    }
}
