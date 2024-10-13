public class PaymentProcessor {
    public boolean process(String account, double amount) {
        System.out.println("Payment of $" + amount + " processed for account: " + account);
        return true; // Simulate a successful payment
    }
}
