public class InventoryManager {
    public boolean checkStock(String productName) {
        System.out.println("Checking stock for: " + productName);
        return true;
    }

    public void update(String productName) {
        System.out.println("Inventory updated with: " + productName);
    }
}
