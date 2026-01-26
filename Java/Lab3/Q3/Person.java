public class Person {
    private String name;
    private String address;
    private String telephoneNumber;
    
    // Constructor
    public Person(String name, String address, String telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return telephoneNumber;
    }
}