public class PreferredCustomer extends Customer {
    private double purchases;
    
    // Constructor
    public PreferredCustomer(String name, String address, String phone,String cNumber, boolean mailingList,double purchases) {
        super(name, address, phone, cNumber, mailingList);
        this.purchases = purchases;
    }
    
    // Getter for purchases
    public double getPurchases() {
        return purchases;
    }
    
    // Method to calculate discount level
    public double getDiscountLevel() {
        if (purchases >= 2000) {
            return 10.0;
        } else if (purchases >= 1500) {
            return 7.0;
        } else if (purchases >= 1000) {
            return 6.0;
        } else if (purchases >= 500) {
            return 5.0;
        } else {
            return 0.0;
        }
    }
}