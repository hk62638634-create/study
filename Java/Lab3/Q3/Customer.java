public class Customer extends Person {
    private String cNumber;
    private boolean mailingList;
    
    // Constructor
    public Customer(String name, String address, String phone, 
                   String cNumber, boolean mailingList) {
        super(name, address, phone);
        this.cNumber = cNumber;
        this.mailingList = mailingList;
    }
    
    // Getters
    public String getCNumber() {
        return cNumber;
    }
    
    public boolean getMailingList() {
        return mailingList;
    }
}