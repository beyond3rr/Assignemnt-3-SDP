import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingFacade shop = new ShoppingFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name (e.g., laptop): ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product product = new ElectronicsProduct(productName, price);

        System.out.print("Enter your account name: ");
        String account = scanner.nextLine();

        shop.placeOrder(product, account);

        scanner.close();
    }
}
