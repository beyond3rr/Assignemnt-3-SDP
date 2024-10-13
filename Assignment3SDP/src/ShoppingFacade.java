public class ShoppingFacade {
    private ProductCatalog catalog;
    private PaymentProcessor payment;
    private InventoryManager inventory;
    private ShippingService shipping;

    public ShoppingFacade() {
        catalog = new ProductCatalog();
        payment = new PaymentProcessor();
        inventory = new InventoryManager();
        shipping = new ShippingService();
    }

    public void placeOrder(Product product, String account) {
        String productName = product.getName(); // Get the product name
        System.out.println("Ordering: " + productName);

        catalog.selectProduct(productName);

        if (!inventory.checkStock(productName)) {
            System.out.println("Out of stock: " + productName);
            return;
        }

        double price = product instanceof ElectronicsProduct ?
                product.getPrice() * 0.95 :
                product.getPrice();
        System.out.println("Final price: $" + price);

        if (!payment.process(account, price)) {
            System.out.println("Payment failed for: " + productName);
            return;
        }

        inventory.update(productName);

        double shipCost = shipping.calcShipping(productName);
        System.out.println("Shipping cost: $" + shipCost);
        shipping.ship(productName);

        System.out.println("Order complete for: " + account);
    }
}
