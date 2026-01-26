public class Car extends Vehicle {
    // ✅ Valid override - same signature
    @Override
    public void startEngine() {
        System.out.println("Car starting");
    }
 
    public static void checkFuel() {
        System.out.println("Checking car fuel");
    }
    
    public void internalCheck() {
        System.out.println("Car internal check");
    }
}