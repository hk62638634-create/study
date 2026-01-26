public class PreferredCustomer extends Customer {
    private double purchasesAmount;
    
    // Constructor
    public PreferredCustomer(String name, String address, String phoneNumber,
                           int customerNumber, boolean mailingList,
                           double purchasesAmount) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.purchasesAmount = purchasesAmount;
    }
    
    public double getPurchases() {
        return purchasesAmount;
    }
    
    public double getDiscountLevel() {
        if (purchasesAmount >= 2000) {
            return 10.0;
        } else if (purchasesAmount >= 1500) {
            return 7.0;
        } else if (purchasesAmount >= 1000) {
            return 6.0;
        } else if (purchasesAmount >= 500) {
            return 5.0;
        } else {
            return 0.0;
        }
    }
}