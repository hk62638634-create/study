public class Dog extends Animal {
    private String breed;
    
    // Constructor 1: No parameters - calls super() implicitly
    public Dog() {
        // super() is automatically called by compiler
        this.breed = "Default";
        System.out.println("Dog default constructor called");
    }
    
    // Constructor 2: Takes breed only
    public Dog(String breed) {
        super("Dog"); // Must be first statement
        this.breed = breed;
        System.out.println("Dog 1-param constructor called");
    }
    
    // Constructor 3: Takes name and breed
    public Dog(String name, String breed) {
        super(name, 3); // Explicit super call
        this.breed = breed;
        System.out.println("Dog 2-param constructor called");
    }
    
    // Constructor 4: Takes all parameters
    public Dog(String breed, String name, int age) {
        super(name, age); // Call parent constructor
        this.breed = breed;
        System.out.println("Dog 3-param constructor called");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Breed: " + breed);
    }
}