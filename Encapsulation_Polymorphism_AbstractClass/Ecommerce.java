package Oops.Encapsulation_Polymorphism_AbstractClass;

// Interface for Taxable items
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation (getters & setters)
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Concrete method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
    }
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5% GST";
    }
}

// Groceries class
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    // Groceries are tax-free in this case
}

// Main class
public class Ecommerce {
    // Polymorphic method to calculate final price
    public static void printFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double finalPrice = product.getPrice() + tax - discount;

        product.displayDetails();
        System.out.println("Discount: " + discount);

        if (product instanceof Taxable) {
            System.out.println(((Taxable) product).getTaxDetails());
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No Tax Applicable");
        }

        System.out.println("Final Price: " + finalPrice);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Product p1 = new Electronics(201, "Smartphone", 50000);
        Product p2 = new Clothing(202, "Jeans", 2000);
        Product p3 = new Groceries(203, "Rice (10kg)", 800);

        Product[] products = { p1, p2, p3 };

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}

