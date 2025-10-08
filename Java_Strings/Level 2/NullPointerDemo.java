public class NullPointerDemo {

    public static void generateException() {
        String text = null;  

        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;  

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: text is null!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
