import java.util.Scanner;

public class CustomerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for customer information
        System.out.println("=== Customer Information Entry ===");
        
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        
        System.out.print("Enter customer number (e.g., CUST001): ");
        String cNumber = scanner.nextLine();
        
        System.out.print("Join mailing list? (true/false): ");
        boolean mailingList = scanner.nextBoolean();
        
        System.out.print("Enter purchase amount: $");
        double purchases = scanner.nextDouble();
        
        // Create PreferredCustomer instance
        PreferredCustomer customer = new PreferredCustomer(name, address, phone, cNumber, mailingList,purchases);
        
        // Display results
        System.out.println("\n=== Customer Summary ===");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Phone Number: " + customer.getPhone());
        
        double discount = customer.getDiscountLevel();
        System.out.println("Discount Level: " + discount + "%");
        
        if (discount > 0) {
            System.out.println("Congratulations! You qualify for a " + discount + "% discount on future purchases.");
        } else {
            System.out.println("Spend $500 or more to qualify for discounts.");
        }
        
        scanner.close();
    }
}