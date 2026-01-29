public class Animal {
    private String name;
    private int age;
    
    // Default constructor
    public Animal() {
        this("Unknown", 0); // Call another constructor using this()
        System.out.println("Animal default constructor called");
    }
    
    // One-parameter constructor
    public Animal(String name) {
        this(name, 0); // Constructor chaining
        System.out.println("Animal 1-param constructor called");
    }
    
    // Two-parameter constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal 2-param constructor called");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}