public class ShippingService {
    public double calcShipping(String productName) {
        System.out.println("Calculating shipping with: " + productName);
        return 5.99; // Simulated shipping cost
    }

    public void ship(String productName) {
        System.out.println("Product shipped: " + productName);
    }
}
