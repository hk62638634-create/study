public class ConstructorTest {
    public static void main(String[] args) {
        System.out.println("=== Creating Dog objects ===\n");
        
        System.out.println("1. Dog() - Default constructor:");
        Dog dog1 = new Dog();
        dog1.displayInfo();
        
        System.out.println("\n2. Dog(\"Golden Retriever\") - Breed only:");
        Dog dog2 = new Dog("Golden Retriever");
        dog2.displayInfo();
        
        System.out.println("\n3. Dog(\"Buddy\", \"Labrador\") - Name and breed:");
        Dog dog3 = new Dog("Buddy", "Labrador");
        dog3.displayInfo();
        
        System.out.println("\n4. Dog(\"Poodle\", \"Charlie\", 5) - All params:");
        Dog dog4 = new Dog("Poodle", "Charlie", 5);
        dog4.displayInfo();
    }
}