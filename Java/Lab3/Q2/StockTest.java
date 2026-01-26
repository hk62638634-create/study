public class StockTest {
    public static void main(String[] args) {
        // Create stocks
        Stock stock1 = new Stock("XYZ", 9.62);
        Stock stock2 = new Stock("APPL", 202.3);
        Stock stock3 = new Stock("appl", 202.3);
        
        // Test toString() override
        System.out.println("=== Testing toString() ===");
        System.out.println("Stock 1: " + stock1.toString());
        System.out.println("Stock 2: " + stock2); // Implicit toString() call
        System.out.println("Stock 3: " + stock3);
        
        // Test equals() override
        System.out.println("\n=== Testing equals() ===");
        System.out.println("stock2.equals(stock3): " + stock2.equals(stock3));
        System.out.println("stock3.equals(stock2): " + stock3.equals(stock2));
        
        // Demonstrate == vs equals()
        System.out.println("\n=== == vs equals() ===");
        Stock stock4 = new Stock("XYZ", 9.62);
        System.out.println("stock1 == stock4: " + (stock1 == stock4)); // false
        System.out.println("stock1.equals(stock4): " + stock1.equals(stock4)); // true
    }
}