import java.util.Scanner;
a
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = 0;
        
        // Get valid distance input (non-negative)
        do {
            System.out.print("Enter a distance in meters: ");
            meters = scanner.nextDouble();
            
            if (meters < 0) {
                System.out.println("Error: Distance cannot be negative. Please try again.");
            }
        } while (meters < 0);
        
        int choice;
        
        // Display menu and process choices until user quits
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Error: Invalid choice. Please select 1-4.");
            }
            
            if (choice != 4) {
                System.out.println(); // Add blank line for readability
            }
        } while (choice != 4);
        
        scanner.close();
    }
    
    /**
     * Displays the menu of conversion options.
     */
    public static void menu() {
        System.out.println("\n=== Distance Converter Menu ===");
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }
    
    /**
     * Converts meters to kilometers and displays the result.
     * 
     * @param meters the distance in meters to convert
     */
    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.printf("%.2f meters = %.4f kilometers%n", meters, kilometers);
    }
    
    /**
     * Converts meters to inches and displays the result.
     * 
     * @param meters the distance in meters to convert
     */
    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.printf("%.2f meters = %.2f inches%n", meters, inches);
    }
    
    /**
     * Converts meters to feet and displays the result.
     * 
     * @param meters the distance in meters to convert
     */
    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.printf("%.2f meters = %.2f feet%n", meters, feet);
    }
}