
public class Stock {
    private String companyName;
    private double price;
    
    public Stock(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Stock[Company=" + companyName + ", Price=$" + price + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        // Check if null or different class
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Stock other = (Stock) obj;
        return companyName.equalsIgnoreCase(other.companyName) && 
               Double.compare(price, other.price) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * companyName.toLowerCase().hashCode() + 
               Double.hashCode(price);
    }
}