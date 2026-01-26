public class TestOverride {
    public static void main(String[] args) {
        System.out.println("=== Testing Polymorphism ===");
        
        Vehicle vehicle = new Vehicle();
        System.out.print("Vehicle start: ");
        vehicle.startEngine();
        
        Car car = new Car();
        System.out.print("Car start: ");
        car.startEngine();
    
        Vehicle polyVehicle = new Car();
        System.out.print("Polymorphic start: ");
        polyVehicle.startEngine(); 
        
        System.out.print("Polymorphic stop: ");
        polyVehicle.stopEngine(); 
        
        System.out.print("Static method (Vehicle): ");
        Vehicle.checkFuel();
        System.out.print("Static method (Car): ");
        Car.checkFuel();
    }
}