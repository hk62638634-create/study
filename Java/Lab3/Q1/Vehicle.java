// void管返回，final定终身，static管共享，
public class Vehicle {

    public void startEngine() {
        System.out.println("Vehicle starting");
    }
    
    public final void stopEngine() {
        System.out.println("Vehicle stopping");
    }
    
    
    public static void checkFuel() {
        System.out.println("Checking vehicle fuel");
    }
    
    private void internalCheck() {
        System.out.println("Internal check");
    }
}