package gioi1;

public class PaymentProcessor {
    public void pay(PaymentMethod paymentMethod, double amount) {
        paymentMethod.biggestPayment(amount);
    }
}
