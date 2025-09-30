package Inheritance;

// Superclass Animal
class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // call Animal constructor
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet Tweet!");
    }
}

// Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Inheritance and polymorphism demo
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Method overriding in action
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        // Polymorphism with array of Animals
        System.out.println("\n--- Polymorphism Demo ---");
        Animal[] animals = {dog, cat, bird};
        for (Animal a : animals) {
            a.makeSound(); // Dynamic method dispatch
        }
    }
}

