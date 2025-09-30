package Oops.Encapsulation_Polymorphism_AbstractClass;

// Interface for discountable items
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation - Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Concrete method
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}

// Subclass VegItem
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount: " + discount + "% applied.";
    }
}

// Subclass NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double NONVEG_CHARGE = 20.0; // Extra charge for non-veg

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + NONVEG_CHARGE;
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg item discount: " + discount + "% applied.";
    }
}

// Main class to demonstrate polymorphism
public class OnlineFoodDeliverySystem {
    // Polymorphic method to process orders
    public static void processOrder(FoodItem[] items) {
        System.out.println("\n--- Order Summary ---");
        double grandTotal = 0;

        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);
            grandTotal += total;
        }

        System.out.println("Grand Total = " + grandTotal);
    }

    public static void main(String[] args) {
        // Creating food items
        FoodItem veg = new VegItem("Paneer Butter Masala", 150, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 200, 1);

        // Applying discounts
        ((Discountable) veg).applyDiscount(10);    // 10% discount
        ((Discountable) nonVeg).applyDiscount(5);  // 5% discount

        // Checking discount details
        System.out.println(((Discountable) veg).getDiscountDetails());
        System.out.println(((Discountable) nonVeg).getDiscountDetails());

        // Polymorphism: processing both Veg and Non-Veg items together
        FoodItem[] order = {veg, nonVeg};
        processOrder(order);
    }
}

