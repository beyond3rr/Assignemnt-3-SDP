public class ElectronicsProduct implements Product {
    private double price;
    private String name; // New field for the product name

    public ElectronicsProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() { // Implementation of getName()
        return name;
    }
}
