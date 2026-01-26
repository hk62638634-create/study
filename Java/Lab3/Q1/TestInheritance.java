public class TestInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        System.out.println("=== Calling displayCarInfo() ===");
        myCar.displayCarInfo();
        
        System.out.println("\n=== Direct access from main ===");
        System.out.println("Year: " + myCar.year);
        System.out.println("Color: " + myCar.color);
        System.out.println("VIN (via getter): " + myCar.getVIN());
        
    }
}