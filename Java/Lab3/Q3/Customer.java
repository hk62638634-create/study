public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;
    
    // Constructor
    public Customer(String name, String address, String phoneNumber,
                   int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber); // Must call parent constructor
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    
    // Getters
    public int getCNumber() {
        return customerNumber;
    }
    
    public boolean getMailingList() {
        return mailingList;
    }
}